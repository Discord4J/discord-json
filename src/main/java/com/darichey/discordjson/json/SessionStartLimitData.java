package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableSessionStartLimitData.class)
public interface SessionStartLimitData {

    int total();
    int remaining();
    @JsonProperty("reset_after")
    int resetAfter();
}
