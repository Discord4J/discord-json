package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationModifyRequest.class)
@JsonDeserialize(as = ImmutableIntegrationModifyRequest.class)
public interface IntegrationModifyRequest {

    static ImmutableIntegrationModifyRequest.Builder builder() {
        return ImmutableIntegrationModifyRequest.builder();
    }

    @JsonProperty("expire_behavior")
    Possible<? extends Integer> expireBehavior();
    @JsonProperty("expire_grace_period")
    Possible<? extends Integer> expireGracePeriod();
    @JsonProperty("enable_emoticons")
    Possible<? extends Boolean> enableEmoticons();
}
