package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePermissionsEditRequest.class)
@JsonDeserialize(as = ImmutablePermissionsEditRequest.class)
public interface PermissionsEditRequest {

    static ImmutablePermissionsEditRequest.Builder builder() {
        return ImmutablePermissionsEditRequest.builder();
    }

    String allow();
    String deny();
    String type();
}
