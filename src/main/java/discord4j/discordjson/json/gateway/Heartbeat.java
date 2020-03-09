package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(converter = HeartbeatConverter.class)
@JsonDeserialize(as = ImmutableHeartbeat.class)
public interface Heartbeat extends PayloadData {

    int seq();
}
