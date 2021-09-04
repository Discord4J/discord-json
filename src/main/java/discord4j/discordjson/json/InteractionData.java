package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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

    /** id of the application this interaction is for */
    @JsonProperty("application_id")
    String applicationId();

    /** the type of the interaction */
    int type();

    /** the command data payload */
    Possible<ApplicationCommandInteractionData> data();

    /** the guild it was sent from */
    @JsonProperty("guild_id")
    Possible<String> guildId();

    /** the channel it was sent from */
    @JsonProperty("channel_id")
    Possible<String> channelId();

    /** guild member data for the invoking user */
    Possible<MemberData> member();

    /** user object for the invoking user, if invoked in a DM */
    Possible<UserData> user();

    /** a continuation token for responding to the interaction */
    String token();

    /** read-only property, always 1 */
    int version();

    /** for components, the message they were attached to */
    Possible<MessageData> message();
}
