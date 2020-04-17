package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteCreateRequest.class)
@JsonDeserialize(as = ImmutableInviteCreateRequest.class)
public interface InviteCreateRequest {

    static ImmutableInviteCreateRequest.Builder builder() {
        return ImmutableInviteCreateRequest.builder();
    }

    @JsonProperty("max_age")
    int maxAge();
    @JsonProperty("max_uses")
    int maxUses();
    boolean temporary();
    boolean unique();
}
