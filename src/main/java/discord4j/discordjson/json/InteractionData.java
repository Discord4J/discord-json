package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.gateway.Dispatch;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionData.class)
@JsonDeserialize(as = ImmutableInteractionData.class)
public interface InteractionData {

    static ImmutableInteractionData.Builder builder() {
        return ImmutableInteractionData.builder();
    }

    /** id of the interaction */
    String id();

    /** the type of the interaction */
    int type();

    /** the command data payload */
    Possible<ApplicationCommandInteractionData> data();

    /** the guild it was sent from */
    @JsonProperty("guild_id")
    String guildId();

    /** the channel it was sent from */
    @JsonProperty("channel_id")
    String channelId();

    /** guild member data for the invoking user */
    MemberData member();

    /** a continuation token for respoding to the interaction */
    String token();

    /** read-only property, always 1 */
    int version();
}
