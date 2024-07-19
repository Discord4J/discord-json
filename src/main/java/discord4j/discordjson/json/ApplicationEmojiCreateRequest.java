package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationEmojiCreateRequest.class)
@JsonDeserialize(as = ImmutableApplicationEmojiCreateRequest.class)
public interface ApplicationEmojiCreateRequest extends EmojiCreateRequest {

    static ImmutableApplicationEmojiCreateRequest.Builder builder() {
        return ImmutableApplicationEmojiCreateRequest.builder();
    }

    // Note: this class is empty to allow future modifications without having to create it
}
