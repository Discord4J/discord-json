package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableIntegrationModifyRequest.class)
public interface IntegrationModifyRequest {

    @JsonProperty("expire_behavior")
    Possible<Integer> expireBehavior();
    @JsonProperty("expire_grace_period")
    Possible<Integer> expireGracePeriod();
    @JsonProperty("enable_emoticons")
    Possible<Boolean> enableEmoticons();
}
