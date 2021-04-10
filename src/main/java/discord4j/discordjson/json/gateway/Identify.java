package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIdentify.class)
@JsonDeserialize(as = ImmutableIdentify.class)
public interface Identify extends PayloadData {

    static ImmutableIdentify.Builder builder() {
        return ImmutableIdentify.builder();
    }

    String token();

    IdentifyProperties properties();

    Possible<Boolean> compress();

    @JsonProperty("large_threshold")
    int largeThreshold();

    Possible<int[]> shard();

    Possible<StatusUpdate> presence();

    Possible<Long> intents();

}
