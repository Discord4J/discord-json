package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivitySecretsData.class)
public interface ActivitySecretsData {

    Possible<String> join();

    Possible<String> spectate();

    Possible<String> match();
}
