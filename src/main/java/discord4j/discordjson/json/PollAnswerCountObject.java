package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePollAnswerCountObject.class)
@JsonDeserialize(as = ImmutablePollAnswerCountObject.class)
public interface PollAnswerCountObject {

    int id();

    int count();

    @JsonProperty("me_voted")
    boolean meVoted();

}
