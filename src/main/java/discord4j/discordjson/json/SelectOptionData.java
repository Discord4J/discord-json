package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSelectOptionData.class)
@JsonDeserialize(as = ImmutableSelectOptionData.class)
public interface SelectOptionData {

    static ImmutableSelectOptionData.Builder builder() {
        return ImmutableSelectOptionData.builder();
    }

    String label();

    String value();
    
    Possible<String> description();

    Possible<EmojiData> emoji();

    // TODO: docs are wrong, this is optional
    @JsonProperty("default")
    Possible<Boolean> isDefault();
}
