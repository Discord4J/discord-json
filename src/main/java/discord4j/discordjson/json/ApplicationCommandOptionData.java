package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

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

    @JsonProperty("name_localizations")
    Possible<Map<String, String>> nameLocalizations();

    /**
     * 1-100 character description
     */
    String description();

    @JsonProperty("description_localizations")
    Possible<Map<String, String>> descriptionLocalizations();

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
     * Whether this option supports auto complete or not -- default false.
     * <p>
     * May not be set if choices are present
     */
    Possible<Boolean> autocomplete();

    /**
     * List of values of value of Channel.Type of which users can pick for the CHANNEL type option.
     * <p>
     * If not provided, no restriction is placed on channel types.
     */
    @JsonProperty("channel_types")
    Possible<List<Integer>> channelTypes();

    /**
     * The minimum value allowed to be entered. Only valid for INTEGER and NUMBER type options.
     * </p>
     * If not provided, no restriction is placed on the minimum value permitted.
     */
    @JsonProperty("min_value")
    Possible<Double> minValue();

    /**
     * The maximum value allowed to be entered. Only valid for INTEGER and NUMBER type options.
     * </p>
     * If not provided, no restriction is placed on the maximum value permitted.
     */
    @JsonProperty("max_value")
    Possible<Double> maxValue();

    /**
     * The minimum value allowed to be entered (minimum of 0). Only valid for STRING type option.
     * </p>
     * If not provided, no restriction is placed on the minimum value permitted.
     */
    @JsonProperty("min_length")
    Possible<Integer> minLength();

    /**
     * The maximum value allowed to be entered (minimum of 1). Only valid for STRING type option.
     * </p>
     * If not provided, no restriction is placed on the maximum value permitted.
     */
    @JsonProperty("max_length")
    Possible<Integer> maxLength();
}
