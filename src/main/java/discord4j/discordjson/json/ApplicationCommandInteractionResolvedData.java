package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandInteractionResolvedData.class)
@JsonDeserialize(as = ImmutableApplicationCommandInteractionResolvedData.class)
public interface ApplicationCommandInteractionResolvedData {

    static ImmutableApplicationCommandInteractionResolvedData.Builder builder() {
        return ImmutableApplicationCommandInteractionResolvedData.builder();
    }


}
