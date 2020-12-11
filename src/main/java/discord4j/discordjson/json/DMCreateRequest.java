package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableDMCreateRequest.class)
@JsonDeserialize(as = ImmutableDMCreateRequest.class)
public interface DMCreateRequest {

    static ImmutableDMCreateRequest.Builder builder() {
        return ImmutableDMCreateRequest.builder();
    }

    @JsonProperty("recipient_id")
    Id recipientId();
}
