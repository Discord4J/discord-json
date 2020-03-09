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

    String url();
    default Possible<Integer> shards() { return Possible.absent(); }
    @JsonProperty("session_start_limit")
    default Possible<SessionStartLimitData> sessionStartLimit() { return Possible.absent(); }
}
