package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmojiCreateRequest.class)
@JsonDeserialize(as = ImmutableEmojiCreateRequest.class)
public interface EmojiCreateRequest {

    static ImmutableEmojiCreateRequest.Builder builder() {
        return ImmutableEmojiCreateRequest.builder();
    }

    String name();
    String image();

}
