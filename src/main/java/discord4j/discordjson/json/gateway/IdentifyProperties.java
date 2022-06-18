package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIdentifyProperties.class)
@JsonDeserialize(as = ImmutableIdentifyProperties.class)
public interface IdentifyProperties {

    static ImmutableIdentifyProperties.Builder builder() {
        return ImmutableIdentifyProperties.builder();
    }

    String os();
    String browser();
    String device();
}
