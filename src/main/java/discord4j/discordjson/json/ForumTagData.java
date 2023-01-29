package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableForumTagData.class)
@JsonDeserialize(as = ImmutableForumTagData.class)
public interface ForumTagData {

    static ImmutableForumTagData.Builder builder() {
        return ImmutableForumTagData.builder();
    }

    Possible<Id> id();

    Possible<String> name();

    Possible<Boolean> moderated();

    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    @JsonProperty("emoji_name")
    Optional<String> emojiName();
}
