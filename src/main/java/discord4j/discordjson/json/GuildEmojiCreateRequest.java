package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmojiCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildEmojiCreateRequest.class)
public interface GuildEmojiCreateRequest extends EmojiCreateRequest {

    static ImmutableGuildEmojiCreateRequest.Builder builder() {
        return ImmutableGuildEmojiCreateRequest.builder();
    }

    List<String> roles();
}
