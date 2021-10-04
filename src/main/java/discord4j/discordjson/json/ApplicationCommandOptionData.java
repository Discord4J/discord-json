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

    /** choices for STRING, INTEGER, and NUMBER Application Command Option Types for the user to pick from */
    Possible<List<ApplicationCommandOptionChoiceData>> choices();

    /**
     * if the option is a subcommand or subcommand group type, this nested options will be the parameters
     */
    Possible<List<ApplicationCommandOptionData>> options();

    /**
     * List of values of value of Channel.Type of which users can pick for the CHANNEL type option.
     * <p/>
     * If not provided, no restriction is placed on channel types.
     */
    @JsonProperty("channel_types")
    Possible<List<Integer>> channelTypes();
}
