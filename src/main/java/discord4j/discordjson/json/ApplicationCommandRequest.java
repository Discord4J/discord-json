package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandRequest.class)
@JsonDeserialize(as = ImmutableApplicationCommandRequest.class)
public interface ApplicationCommandRequest {

    static ImmutableApplicationCommandRequest.Builder builder() {
        return ImmutableApplicationCommandRequest.builder();
    }

    /**
     * 1-32 character name matching ^[\w-]{1,32}$
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

    @JsonProperty("default_permission")
    Possible<Boolean> defaultPermission();
}
