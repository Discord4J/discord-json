package com.darichey.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableResumed.class)
public interface Resumed extends Dispatch {

    @JsonProperty("_trace")
    List<String> trace();
}
