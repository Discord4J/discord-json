package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.InteractionData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInteractionCreate.class)
@JsonDeserialize(as = ImmutableInteractionCreate.class)
public interface InteractionCreate extends Dispatch {

    static ImmutableInteractionCreate.Builder builder() {
        return ImmutableInteractionCreate.builder();
    }

    @JsonUnwrapped
    InteractionData interaction();
}
