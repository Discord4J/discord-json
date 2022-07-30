package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandData.class)
@JsonDeserialize(as = ImmutableApplicationCommandData.class)
public interface ApplicationCommandData {

    static ImmutableApplicationCommandData.Builder builder() {
        return ImmutableApplicationCommandData.builder();
    }

    /**
     * unique id of the command
     */
    Id id();

    /**
     * Autoincrementing version identifier updated during substantial record changes
     */
    Id version();

    /**
     * guild id of the command, if not global
     */
    @JsonProperty("guild_id")
    Possible<Id> guildId();

    /**
     *  value of ApplicationCommandType (defaults to 1, CHAT_INPUT)
     */
    Possible<Integer> type();

    /**
     * unique id of the parent application
     */
    @JsonProperty("application_id")
    Id applicationId();

    /**
     * 1-32 character name
     */
    String name();

    @JsonProperty("name_localizations")
    Possible<Optional<Map<String, String>>> nameLocalizations();

    /**
     * 0-100 character description
     */
    String description();

    @JsonProperty("description_localizations")
    Possible<Optional<Map<String, String>>> descriptionLocalizations();

    /**
     * the parameters for the command
     */
    Possible<List<ApplicationCommandOptionData>> options();

    /**
     * whether the command is enabled in DM by default when the app is added globally (default to true)
     */
    @JsonProperty("dm_permission")
    Possible<Boolean> dmPermission();

    /**
     * whether the command is enabled by default when the app is added to a guild (default to true)
     */
    @JsonProperty("default_permission")
    @Deprecated
    Possible<Boolean> defaultPermission();

    /**
     * Set of permissions represented as a bit set
     */
    @JsonProperty("default_member_permissions")
    Optional<String> defaultMemberPermissions();
}
