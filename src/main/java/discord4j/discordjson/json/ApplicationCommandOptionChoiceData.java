package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandOptionChoiceData.class)
@JsonDeserialize(as = ImmutableApplicationCommandOptionChoiceData.class)
public interface ApplicationCommandOptionChoiceData {

    static ImmutableApplicationCommandOptionChoiceData.Builder builder() {
        return ImmutableApplicationCommandOptionChoiceData.builder();
    }

    /**
     * 1-100 character choice name
     */
    String name();

    /**
     * value of the choice, should be either an up to 100 character {@link String} for ApplicationCommandOptionType.STRING,
     * a {@link Byte}/{@link Short}/{@link Integer}/{@link Long} for ApplicationCommandOptionType.INTEGER
     * or a {@link Float}/{@link Double} for ApplicationCommandOptionType.NUMBER.
     *
     * @see <a href="https://discord.com/developers/docs/interactions/slash-commands#applicationcommandoptionchoice">ApplicationCommandOptionChoice</a>
     */
    Object value();
}
