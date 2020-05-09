package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSessionStartLimitData.class)
@JsonDeserialize(as = ImmutableSessionStartLimitData.class)
public interface SessionStartLimitData {

    static ImmutableSessionStartLimitData.Builder builder() {
        return ImmutableSessionStartLimitData.builder();
    }

    int total();
    int remaining();
    @JsonProperty("reset_after")
    int resetAfter();
    @JsonProperty("max_concurrency")
    Possible<Integer> maxConcurrency();

}
