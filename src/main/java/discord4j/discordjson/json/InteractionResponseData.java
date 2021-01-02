package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionResponseData.class)
@JsonDeserialize(as = ImmutableInteractionResponseData.class)
public interface InteractionResponseData {

    static ImmutableInteractionResponseData.Builder builder() {
        return ImmutableInteractionResponseData.builder();
    }

    /**
     * the type of the response
     */
    int type();

    /**
     * an optional response message
     */
    Possible<InteractionApplicationCommandCallbackData> data();
}
