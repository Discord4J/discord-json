package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableResumed.class)
@JsonDeserialize(as = ImmutableResumed.class)
public interface Resumed extends Dispatch {

    @JsonProperty("_trace")
    List<String> trace();
}
