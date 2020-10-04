package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmojiCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildEmojiCreateRequest.class)
public interface GuildEmojiCreateRequest {

    static ImmutableGuildEmojiCreateRequest.Builder builder() {
        return ImmutableGuildEmojiCreateRequest.builder();
    }

    String name();
    String image();
    List<Id> roles();
}
