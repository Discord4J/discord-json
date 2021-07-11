package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableComponentData.class)
@JsonDeserialize(as = ImmutableComponentData.class)
public interface ComponentData {

    static ImmutableComponentData.Builder builder() {
        return ImmutableComponentData.builder();
    }

    int type();

    // TODO docs don't have this but it's obviously there
    Possible<List<ComponentData>> components();

    Possible<Integer> style();

    Possible<String> label();

    Possible<EmojiData> emoji();

    @JsonProperty("custom_id")
    Possible<String> customId();

    Possible<String> url();

    Possible<Boolean> disabled();

    Possible<String> placeholder();

    @JsonProperty("min_values")
    Possible<Integer> minValues();

    @JsonProperty("max_values")
    Possible<Integer> maxValues();

    Possible<List<SelectOptionData>> options();
}
