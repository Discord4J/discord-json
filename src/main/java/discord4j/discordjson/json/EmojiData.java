package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableEmojiData.class)
@JsonDeserialize(as = ImmutableEmojiData.class)
public interface EmojiData {

    static ImmutableEmojiData.Builder builder() {
        return ImmutableEmojiData.builder();
    }

    Optional<String> id();

    Optional<String> name();

    Possible<List<String>> roles();

    Possible<UserData> user();

    @JsonProperty("require_colons")
    Possible<Boolean> requireColons();

    Possible<Boolean> managed();

    Possible<Boolean> available();

    Possible<Boolean> animated();
}
