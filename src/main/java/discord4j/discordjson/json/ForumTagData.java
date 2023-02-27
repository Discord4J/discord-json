package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableForumTagData.class)
@JsonDeserialize(as = ImmutableForumTagData.class)
public interface ForumTagData {

    static ImmutableForumTagData.Builder builder() {
        return ImmutableForumTagData.builder();
    }

    Id id();

    String name();

    Boolean moderated();

    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    @JsonProperty("emoji_name")
    Optional<String> emojiName();
}
