package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGatewayData.class)
@JsonDeserialize(as = ImmutableGatewayData.class)
public interface GatewayData {

    static ImmutableGatewayData.Builder builder() {
        return ImmutableGatewayData.builder();
    }

    String url();
    Possible<? extends Integer> shards();
    @JsonProperty("session_start_limit")
    Possible<? extends SessionStartLimitData> sessionStartLimit();
}
