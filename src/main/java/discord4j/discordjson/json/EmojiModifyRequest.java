package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmojiModifyRequest.class)
@JsonDeserialize(as = ImmutableEmojiModifyRequest.class)
public interface EmojiModifyRequest {

    static ImmutableEmojiModifyRequest.Builder builder() {
        return ImmutableEmojiModifyRequest.builder();
    }

    Possible<String> name();

}
