package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationEmojiModifyRequest.class)
@JsonDeserialize(as = ImmutableApplicationEmojiModifyRequest.class)
public interface ApplicationEmojiModifyRequest extends EmojiModifyRequest {

    static ImmutableApplicationEmojiModifyRequest.Builder builder() {
        return ImmutableApplicationEmojiModifyRequest.builder();
    }

    // Note: this class is empty to allow future modifications without having to create it
}
