package com.discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableIdentifyProperties.class)
public interface IdentifyProperties {

    @JsonProperty("$os")
    String os();
    @JsonProperty("$browser")
    String browser();
    @JsonProperty("$device")
    String device();
}
