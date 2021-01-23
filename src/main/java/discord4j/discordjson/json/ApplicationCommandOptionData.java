package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandOptionData.class)
@JsonDeserialize(as = ImmutableApplicationCommandOptionData.class)
public interface ApplicationCommandOptionData {

    static ImmutableApplicationCommandOptionData.Builder builder() {
        return ImmutableApplicationCommandOptionData.builder();
    }

    /**
     * value of ApplicationCommandOptionType
     */
    int type();

    /**
     * 1-32 character name
     */
    String name();

    /**
     * 1-100 character description
     */
    String description();

    /**
     * if the parameter is required or optional -- default false
     */
    Possible<Boolean> required();

    /** choices for string and int types for the user to pick from */
    Possible<List<ApplicationCommandOptionChoiceData>> choices();

    /**
     * if the option is a subcommand or subcommand group type, this nested options will be the parameters
     */
    Possible<List<ApplicationCommandOptionData>> options();
}
