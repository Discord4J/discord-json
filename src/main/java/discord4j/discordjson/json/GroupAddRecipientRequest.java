package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGroupAddRecipientRequest.class)
@JsonDeserialize(as = ImmutableGroupAddRecipientRequest.class)
public interface GroupAddRecipientRequest {

    static ImmutableGroupAddRecipientRequest.Builder builder() {
        return ImmutableGroupAddRecipientRequest.builder();
    }

    @JsonProperty("access_token")
    String accessToken();
    String nick();
}
