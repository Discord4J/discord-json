package com.discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableResume.class)
public interface Resume extends PayloadData {

    String token();
    @JsonProperty("session_id")
    String sessionId();
    int seq();
}
