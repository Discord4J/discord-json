package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionApplicationCommandCallbackData.class)
@JsonDeserialize(as = ImmutableInteractionApplicationCommandCallbackData.class)
public interface InteractionApplicationCommandCallbackData extends MessageRequestBase {

    static ImmutableInteractionApplicationCommandCallbackData.Builder builder() {
        return ImmutableInteractionApplicationCommandCallbackData.builder();
    }

    Possible<Integer> flags();
}
