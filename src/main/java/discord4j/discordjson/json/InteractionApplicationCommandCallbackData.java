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
}
