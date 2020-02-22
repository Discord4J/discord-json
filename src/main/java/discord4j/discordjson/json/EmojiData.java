package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmojiData.class)
public interface EmojiData {

    Optional<String> id();

    Optional<String> name();

    default Possible<List<String>> roles() { return Possible.absent(); }

    default Possible<UserData> user() { return Possible.absent(); }

    @JsonProperty("require_colons")
    default Possible<Boolean> requireColons() { return Possible.absent(); }

    default Possible<Boolean> managed() { return Possible.absent(); }

    default Possible<Boolean> available() { return Possible.absent(); }

    default Possible<Boolean> animated() { return Possible.absent(); }
}
