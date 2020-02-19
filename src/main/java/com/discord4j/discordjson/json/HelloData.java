package com.discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableHelloData.class)
public interface HelloData {

    @JsonProperty("heartbeat_interval")
    int heartbeatInterval();
}
