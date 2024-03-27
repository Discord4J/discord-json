package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePollResultObject.class)
@JsonDeserialize(as = ImmutablePollResultObject.class)
public interface PollResultObject {

    @JsonProperty("is_finalized")
    boolean isFinalized();

    @JsonProperty("answer_counts")
    List<PollAnswerCountObject> answerCounts();

}
