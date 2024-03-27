package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionData.class)
@JsonDeserialize(as = ImmutableInteractionData.class)
public interface InteractionData {

    static ImmutableInteractionData.Builder builder() {
        return ImmutableInteractionData.builder();
    }

    /** id of the interaction */
    Id id();

    /** id of the application this interaction is for */
    @JsonProperty("application_id")
    Id applicationId();

    /** the type of the interaction */
    int type();

    /** the command data payload */
    Possible<ApplicationCommandInteractionData> data();

    /** the guild it was sent from */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /** Partial Channel that the interaction was sent from */
    Possible<ChannelData> channel();

    /** the channel it was sent from */
    @JsonProperty("channel_id")
    Possible<Id> channelId();

    /** guild member data for the invoking user */
    Possible<MemberData> member();

    /** user object for the invoking user, if invoked in a DM */
    Possible<UserData> user();

    /** a continuation token for responding to the interaction */
    String token();

    /** read-only property, always 1 */
    int version();

    /** message associated with the interaction. */
    Possible<MessageData> message();

    /** The issuing user's client locale. Present on all interactions except ping */
    Possible<String> locale();

    /** The guild's locale, if invoked in a guild. Defaults to English for non-community servers */
    @JsonProperty("guild_locale")
    Possible<String> guildLocale();

    @JsonProperty("app_permissions")
    Possible<String> appPermissions();

    @JsonProperty("entitlements")
    List<EntitlementData> entitlements();
}
