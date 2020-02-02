package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityTimestampsData.class)
public interface ActivityTimestampsData {

    Possible<Integer> start();

    Possible<Integer> end();
}
