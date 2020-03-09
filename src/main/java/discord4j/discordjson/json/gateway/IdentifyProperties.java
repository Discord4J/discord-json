package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIdentifyProperties.class)
@JsonDeserialize(as = ImmutableIdentifyProperties.class)
public interface IdentifyProperties {

    @JsonProperty("$os")
    String os();
    @JsonProperty("$browser")
    String browser();
    @JsonProperty("$device")
    String device();
}
