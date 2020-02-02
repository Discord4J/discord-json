package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutablePermissionsEditRequest.class)
public interface PermissionsEditRequest {

    long allow();
    long deny();
    String type();
}
