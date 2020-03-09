package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableResume.class)
@JsonDeserialize(as = ImmutableResume.class)
public interface Resume extends PayloadData {

    String token();
    @JsonProperty("session_id")
    String sessionId();
    int seq();
}
