package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePollAnswerObject.class)
@JsonDeserialize(as = ImmutablePollAnswerObject.class)
public interface PollAnswerObject {

    static ImmutablePollAnswerObject.Builder builder() {
        return ImmutablePollAnswerObject.builder();
    }

    @JsonProperty("answer_id")
    int answerId();

    @JsonProperty("poll_media")
    PollMediaObject data();

}
