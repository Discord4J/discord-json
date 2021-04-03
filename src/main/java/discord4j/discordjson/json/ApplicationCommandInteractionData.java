package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandInteractionData.class)
@JsonDeserialize(as = ImmutableApplicationCommandInteractionData.class)
public interface ApplicationCommandInteractionData {

    static ImmutableApplicationCommandInteractionData.Builder builder() {
        return ImmutableApplicationCommandInteractionData.builder();
    }

    /** the ID of the invoked command */
    String id();

    /** the name of the invoked command */
    String name();

    /** converted users + members + roles + channels */
    Possible<ApplicationCommandInteractionResolvedData> resolved();

    /** the params + values from the user */
    Possible<List<ApplicationCommandInteractionOptionData>> options();
}
