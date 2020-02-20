package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableHello.class)
public interface Hello extends PayloadData {

    @JsonProperty("heartbeat_interval")
    int heartbeatInterval();
}
