package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableClientStatusData.class)
public interface ClientStatusData {

    Possible<String> desktop();

    Possible<String> mobile();

    Possible<String> web();
}
