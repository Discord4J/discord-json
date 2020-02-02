package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.UserData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUserUpdate.class)
public interface UserUpdate extends Dispatch {

    @JsonUnwrapped
    UserData user();
}
