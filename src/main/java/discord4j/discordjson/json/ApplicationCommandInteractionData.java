package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    // TODO: note: docs are wrong about the optionality of all of these fields. They're all optional
    /** the ID of the invoked command */
    Possible<String> id();

    /** the name of the invoked command */
    Possible<String> name();

    /** the type of the invoked command */
    Possible<Integer> type();

    /** converted users + members + roles + channels */
    Possible<ApplicationCommandInteractionResolvedData> resolved();

    /** the params + values from the user */
    Possible<List<ApplicationCommandInteractionOptionData>> options();

    @JsonProperty("custom_id")
    Possible<String> customId();

    @JsonProperty("component_type")
    Possible<Integer> componentType();

    Possible<List<String>> values();

    /** the ID of the user or message targeted by a user or message command */
    @JsonProperty("target_id")
    Possible<String> targetId();

    /** array of message components for modal submit */
    Possible<List<ComponentData>> components();

}
