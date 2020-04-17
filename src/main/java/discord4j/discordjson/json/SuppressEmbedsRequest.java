package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSuppressEmbedsRequest.class)
@JsonDeserialize(as = ImmutableSuppressEmbedsRequest.class)
public interface SuppressEmbedsRequest {

    static ImmutableSuppressEmbedsRequest.Builder builder() {
        return ImmutableSuppressEmbedsRequest.builder();
    }

    boolean suppress();
}
