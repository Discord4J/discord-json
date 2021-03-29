package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

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
    String id();

    /**
     * unique id of the parent application
     */
    @JsonProperty("application_id")
    String applicationId();

    /**
     * 3-32 character name
     */
    String name();

    /**
     * 1-100 character description
     */
    String description();

    /**
     * the parameters for the command
     */
    Possible<List<ApplicationCommandOptionData>> options();

    /**
     * whether the command is enabled by default when the app is added to a guild (default to true)
     */
    @JsonProperty("default_permission")
    Possible<Boolean> defaultPermission();
}
