package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionApplicationCommandCallbackData.class)
@JsonDeserialize(as = ImmutableInteractionApplicationCommandCallbackData.class)
public interface InteractionApplicationCommandCallbackData {

    static ImmutableInteractionApplicationCommandCallbackData.Builder builder() {
        return ImmutableInteractionApplicationCommandCallbackData.builder();
    }

    /**
     * is the response TTS
     */
    Possible<Boolean> tts();

    /**
     * message content
     */
    Possible<String> content();

    /**
     * supports up to 10 embeds
     */
    Possible<List<EmbedData>> embeds();

    /**
     * allowed mentions object
     */
    @JsonProperty("allowed_mentions")
    Possible<AllowedMentionsData> allowedMentions();

    /**
     * set to 64 to make your response ephemeral
     */
    Possible<Integer> flags();

    Possible<List<ComponentData>> components();

    /**
     * A list of choices the user may pick in an auto-complete response
     * <p>
     * Note: this discord docs are incorrect about the optionality of this field. It is only valid and required for
     * the autocomplete result response type.
     */
    Possible<List<ApplicationCommandOptionChoiceData>> choices();

}
