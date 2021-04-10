/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import reactor.util.annotation.Nullable;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayloadDeserializer extends StdDeserializer<GatewayPayload<?>> {

    private static final String OP_FIELD = "op";
    private static final String D_FIELD = "d";
    private static final String T_FIELD = "t";
    private static final String S_FIELD = "s";

    private static final Map<String, Class<? extends Dispatch>> dispatchTypes = new HashMap<>();

    static {
        dispatchTypes.put("READY", Ready.class);
        dispatchTypes.put("RESUMED", Resumed.class);
        dispatchTypes.put("CHANNEL_CREATE", ChannelCreate.class);
        dispatchTypes.put("CHANNEL_UPDATE", ChannelUpdate.class);
        dispatchTypes.put("CHANNEL_DELETE", ChannelDelete.class);
        dispatchTypes.put("CHANNEL_PINS_UPDATE", ChannelPinsUpdate.class);
        dispatchTypes.put("GUILD_CREATE", GuildCreate.class);
        dispatchTypes.put("GUILD_UPDATE", GuildUpdate.class);
        dispatchTypes.put("GUILD_DELETE", GuildDelete.class);
        dispatchTypes.put("GUILD_BAN_ADD", GuildBanAdd.class);
        dispatchTypes.put("GUILD_BAN_REMOVE", GuildBanRemove.class);
        dispatchTypes.put("GUILD_EMOJIS_UPDATE", GuildEmojisUpdate.class);
        dispatchTypes.put("GUILD_INTEGRATIONS_UPDATE", GuildIntegrationsUpdate.class);
        dispatchTypes.put("GUILD_MEMBER_ADD", GuildMemberAdd.class);
        dispatchTypes.put("GUILD_MEMBER_REMOVE", GuildMemberRemove.class);
        dispatchTypes.put("GUILD_MEMBER_UPDATE", GuildMemberUpdate.class);
        dispatchTypes.put("GUILD_MEMBERS_CHUNK", GuildMembersChunk.class);
        dispatchTypes.put("GUILD_ROLE_CREATE", GuildRoleCreate.class);
        dispatchTypes.put("GUILD_ROLE_UPDATE", GuildRoleUpdate.class);
        dispatchTypes.put("GUILD_ROLE_DELETE", GuildRoleDelete.class);
        dispatchTypes.put("MESSAGE_CREATE", MessageCreate.class);
        dispatchTypes.put("MESSAGE_UPDATE", MessageUpdate.class);
        dispatchTypes.put("MESSAGE_DELETE", MessageDelete.class);
        dispatchTypes.put("MESSAGE_DELETE_BULK", MessageDeleteBulk.class);
        dispatchTypes.put("MESSAGE_REACTION_ADD", MessageReactionAdd.class);
        dispatchTypes.put("MESSAGE_REACTION_REMOVE", MessageReactionRemove.class);
        dispatchTypes.put("MESSAGE_REACTION_REMOVE_ALL", MessageReactionRemoveAll.class);
        dispatchTypes.put("PRESENCE_UPDATE", PresenceUpdate.class);
        dispatchTypes.put("TYPING_START", TypingStart.class);
        dispatchTypes.put("USER_UPDATE", UserUpdate.class);
        dispatchTypes.put("VOICE_STATE_UPDATE", VoiceStateUpdateDispatch.class);
        dispatchTypes.put("VOICE_SERVER_UPDATE", VoiceServerUpdate.class);
        dispatchTypes.put("WEBHOOKS_UPDATE", WebhooksUpdate.class);
        dispatchTypes.put("INVITE_CREATE", InviteCreate.class);
        dispatchTypes.put("INVITE_DELETE", InviteDelete.class);
        dispatchTypes.put("INTERACTION_CREATE", InteractionCreate.class);
        dispatchTypes.put("INTEGRATION_CREATE", IntegrationCreate.class);
        dispatchTypes.put("INTEGRATION_UPDATE", IntegrationUpdate.class);
        dispatchTypes.put("INTEGRATION_DELETE", IntegrationDelete.class);

        // Ignored
        dispatchTypes.put("PRESENCES_REPLACE", null);
        dispatchTypes.put("GIFT_CODE_UPDATE", null);
    }

    public PayloadDeserializer() {
        super(GatewayPayload.class);
    }

    @Override
    public GatewayPayload<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode payload = p.getCodec().readTree(p);

        int op = payload.get(OP_FIELD).asInt();
        String t = payload.get(T_FIELD).asText();
        Integer s = payload.get(S_FIELD).isNull() ? null : payload.get(S_FIELD).intValue();

        Class<? extends PayloadData> payloadType = getPayloadType(op, t);
        if (payloadType == GuildCreate.class) {
            JsonNode d = payload.get(D_FIELD);
            JsonNode unavailable = d.get("unavailable");
            if (unavailable != null && unavailable.asBoolean()) {
                PayloadData data = p.getCodec().treeToValue(d, UnavailableGuildCreate.class);
                return new GatewayPayload(Opcode.forRaw(op), data, s, t);
            }
        }
        PayloadData data = payloadType == null ? null : p.getCodec().treeToValue(payload.get(D_FIELD), payloadType);

        return new GatewayPayload(Opcode.forRaw(op), data, s, t);
    }

    @Nullable
    private static Class<? extends PayloadData> getPayloadType(int op, String t) {
        if (op == Opcode.DISPATCH.getRawOp()) {
            if (!dispatchTypes.containsKey(t)) {
                throw new IllegalArgumentException("Attempt to deserialize payload with unknown event type: " + t);
            }
            return dispatchTypes.get(t);
        }

        Opcode<?> opcode = Opcode.forRaw(op);
        if (opcode == null) {
            throw new IllegalArgumentException("Attempt to deserialize payload with unknown op: " + op);
        }
        return opcode.getPayloadType();
    }
}
