package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationEmojiModifyRequest.class)
@JsonDeserialize(as = ImmutableApplicationEmojiModifyRequest.class)
public interface ApplicationEmojiModifyRequest extends EmojiModifyRequest {

    static ImmutableApplicationEmojiModifyRequest.Builder builder() {
        return ImmutableApplicationEmojiModifyRequest.builder();
    }

    // Note: this class is empty to allow future modifications without having to create it
}
