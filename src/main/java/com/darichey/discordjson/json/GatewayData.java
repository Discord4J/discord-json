package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGatewayData.class)
public interface GatewayData {

    String url();
    Possible<Integer> shards();
    @JsonProperty("session_start_limit")
    Possible<SessionStartLimitData> sessionStartLimit();
}
