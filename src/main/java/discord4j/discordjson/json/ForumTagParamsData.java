package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

/**
 * Immutable tag parameters sent along with create and update requests regarding forum channels
 */
@Value.Immutable
@JsonSerialize(as = ImmutableForumTagParamsData.class)
@JsonDeserialize(as = ImmutableForumTagParamsData.class)
public interface ForumTagParamsData {

    static ImmutableForumTagParamsData.Builder builder() {
        return ImmutableForumTagParamsData.builder();
    }

    String name();

    Possible<Boolean> moderated();

    @JsonProperty("emoji_id")
    Possible<Optional<Id>> emojiId();

    @JsonProperty("emoji_name")
    Possible<Optional<String>> emojiName();
}
