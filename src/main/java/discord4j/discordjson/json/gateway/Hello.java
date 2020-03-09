package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableHello.class)
@JsonDeserialize(as = ImmutableHello.class)
public interface Hello extends PayloadData {

    @JsonProperty("heartbeat_interval")
    int heartbeatInterval();
}
