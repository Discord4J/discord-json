package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityTimestampsData.class)
@JsonDeserialize(as = ImmutableActivityTimestampsData.class)
public interface ActivityTimestampsData {

    static ImmutableActivityTimestampsData.Builder builder() {
        return ImmutableActivityTimestampsData.builder();
    }

    Possible<? extends Long> start();

    Possible<? extends Long> end();
}
