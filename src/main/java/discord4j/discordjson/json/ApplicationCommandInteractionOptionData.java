package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandInteractionOptionData.class)
@JsonDeserialize(as = ImmutableApplicationCommandInteractionOptionData.class)
public interface ApplicationCommandInteractionOptionData {

    static ImmutableApplicationCommandInteractionOptionData.Builder builder() {
        return ImmutableApplicationCommandInteractionOptionData.builder();
    }

    /**
     * the name of the parameter
     */
    String name();

    /**
     * the value of the pair
     */
    Possible<String> value();

    /**
     * present if this option is a group or subcommand
     */
    Possible<List<ApplicationCommandInteractionOptionData>> options();
}
