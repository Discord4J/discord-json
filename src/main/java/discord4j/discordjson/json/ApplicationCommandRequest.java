package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandRequest.class)
@JsonDeserialize(as = ImmutableApplicationCommandRequest.class)
public interface ApplicationCommandRequest {

    static ImmutableApplicationCommandRequest.Builder builder() {
        return ImmutableApplicationCommandRequest.builder();
    }

    /**
     * 1-32 character name matching ^[\w-]{1,32}$ for CHAT_INPUT.
     * USER and MESSAGE commands may be mixed case with spaces
     */
    String name();

    @JsonProperty("name_localizations")
    Possible<Map<String, String>> nameLocalizations();

    /**
     * 1-100 character description. Not allowed for USER and MESSAGE command types
     */
    Possible<String> description();

    @JsonProperty("description_localizations")
    Possible<Map<String, String>> descriptionLocalizations();

    /**
     * the parameters for the command
     */
    Possible<List<ApplicationCommandOptionData>> options();

    /**
     * whether the command is enabled in DM by default when the app is added globally (default to true)
     */
    @JsonProperty("dm_permission")
    Possible<Boolean> dmPermission();

    @JsonProperty("default_permission")
    Possible<Boolean> defaultPermission();

    /**
     * Set of permissions represented as a bit set
     */
    @JsonProperty("default_member_permissions")
    Optional<String> defaultMemberPermissions();

    /**
     * value of ApplicationCommandType (defaults to 1, CHAT_INPUT)
     */
    Possible<Integer> type();
}
