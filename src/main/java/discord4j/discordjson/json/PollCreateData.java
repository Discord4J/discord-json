package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePollCreateData.class)
@JsonDeserialize(as = ImmutablePollCreateData.class)
public interface PollCreateData {

    static ImmutablePollCreateData.Builder builder() {
        return ImmutablePollCreateData.builder();
    }

    PollMediaObject question();

    List<PollAnswerObject> answers();

    int duration();

    @JsonProperty("allow_multiselect")
    boolean allowMultiselect();

    @JsonProperty("layout_type")
    Possible<Integer> layoutType();

}
