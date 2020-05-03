package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityEmojiData.class)
@JsonDeserialize(as = ImmutableActivityEmojiData.class)
public interface ActivityEmojiData {

    static ImmutableActivityEmojiData.Builder builder() {
        return ImmutableActivityEmojiData.builder();
    }

    String name();

    Possible<String> id();

    Possible<Boolean> animated();
}
