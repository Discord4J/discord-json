package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableHelloData.class)
@JsonDeserialize(as = ImmutableHelloData.class)
public interface HelloData {

    static ImmutableHelloData.Builder builder() {
        return ImmutableHelloData.builder();
    }

    @JsonProperty("heartbeat_interval")
    int heartbeatInterval();
}
