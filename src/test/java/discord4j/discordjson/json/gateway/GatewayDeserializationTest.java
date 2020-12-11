package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.PossibleFilter;
import discord4j.discordjson.possible.PossibleModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GatewayDeserializationTest {

    private static final Logger log = LoggerFactory.getLogger(GatewayDeserializationTest.class);

    ObjectMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = new ObjectMapper()
                .registerModule(new PossibleModule())
                .registerModule(new Jdk8Module())
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.PUBLIC_ONLY)
                .setVisibility(PropertyAccessor.CREATOR, JsonAutoDetect.Visibility.ANY)
                .addHandler(new DeserializationProblemHandler() {
                    @Override
                    public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p, JsonDeserializer<
                            ?> deserializer, Object beanOrClass, String propertyName) throws IOException {
                        log.warn("Unknown property in {}: {}", beanOrClass, propertyName);
                        p.skipChildren();
                        return true;
                    }
                })
                .setDefaultPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.CUSTOM,
                        JsonInclude.Include.ALWAYS, PossibleFilter.class, null));
    }

    private <T> T read(String from, TypeReference<T> into) throws IOException {
        return mapper.readValue(getClass().getResourceAsStream(from), into);
    }

    @Test
    public void testChannelCreate() throws IOException {
        GatewayPayload<?> json = read("/gateway/ChannelCreate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelDelete() throws IOException {
        GatewayPayload<?> json = read("/gateway/ChannelDelete.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelPinsUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/ChannelPinsUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testChannelUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/ChannelUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildBanAdd() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildBanAdd.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildBanRemove() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildBanRemove.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildCreate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildCreate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildCreateUnavailable() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildCreate.Unavailable.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildDelete() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildDelete.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildEmojisUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildEmojisUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberAdd() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildMemberAdd.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberRemove() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildMemberRemove.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMembersChunk() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildMembersChunk.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildMemberUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildMemberUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleCreate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildRoleCreate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleDelete() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildRoleDelete.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildRoleUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildRoleUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testGuildUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/GuildUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testHello() throws IOException {
        GatewayPayload<?> json = read("/gateway/Hello.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testInviteCreate() throws IOException {
        GatewayPayload<?> json = read("/gateway/InviteCreate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testInvalidSession() throws IOException {
        GatewayPayload<?> json = read("/gateway/InvalidSession.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageCreate() throws IOException {
        MessageCreate type0 = (MessageCreate) read("/gateway/MessageCreate.Type0.json",
                new TypeReference<GatewayPayload<?>>() {}).getData();
        assertEquals("32309dbaaf65eae4c58a351318f44c9d", type0.message().author().avatar().orElse(""));

        MessageCreate type6 = (MessageCreate) read("/gateway/MessageCreate.Type6.json",
                new TypeReference<GatewayPayload<?>>() {}).getData();
        assertEquals("2020-03-01T21:02:35.282000+00:00", type6.message().timestamp());

        MessageCreate reply = (MessageCreate) read("/gateway/MessageCreate.Type19.json",
                new TypeReference<GatewayPayload<?>>() {}).getData();
        assertEquals(Id.of("563557393640849437"), reply.message().messageReference().get().channelId().get());
    }

    @Test
    public void testMessageDelete() throws IOException {
        GatewayPayload<?> json = read("/gateway/MessageDelete.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageReactionAdd() throws IOException {
        GatewayPayload<?> json = read("/gateway/MessageReactionAdd.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageReactionRemove() throws IOException {
        GatewayPayload<?> json = read("/gateway/MessageReactionRemove.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testMessageUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/MessageUpdate.NoEmbeds.json",
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
        GatewayPayload<?> json2 = read("/gateway/MessageUpdate.Embeds.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json2.getData());
    }

    @Test
    public void testPresenceUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/PresenceUpdate.NoActivities.json",
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
        GatewayPayload<?> json2 = read("/gateway/PresenceUpdate.Activities.json",
                new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json2.getData());
    }

    @Test
    public void testReady() throws IOException {
        GatewayPayload<?> json = read("/gateway/Ready.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testTypingStart() throws IOException {
        GatewayPayload<?> json = read("/gateway/TypingStart.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testVoiceStateUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/VoiceStateUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }

    @Test
    public void testVoiceServerUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/VoiceServerUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        assertEquals(477069, json.getSequence());
        VoiceServerUpdate data = (VoiceServerUpdate) json.getData();
        assertEquals("f8eb804ee40ebf3d", data.token());
        assertEquals(Id.of("691022703368601651"), data.guildId());
        assertNull(data.endpoint());
    }

    @Test
    public void testWebhooksUpdate() throws IOException {
        GatewayPayload<?> json = read("/gateway/WebhooksUpdate.json", new TypeReference<GatewayPayload<?>>() {});
        log.info("{}", json.getData());
    }
}
