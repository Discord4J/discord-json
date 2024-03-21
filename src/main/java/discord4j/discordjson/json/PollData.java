package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePollData.class)
@JsonDeserialize(as = ImmutablePollData.class)
public interface PollData {

    static ImmutablePollData.Builder builder() {
        return ImmutablePollData.builder();
    }

    PollMediaObject question();

    List<PollAnswerObject> answers();

    String expiry();

    @JsonProperty("allow_multiselect")
    boolean allowMultiselect();

    @JsonProperty("layout_type")
    int layoutType();

    Possible<List<PollResultObject>> results();

}
