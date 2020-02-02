package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRoleCreateRequest.class)
public interface RoleCreateRequest {

    String name();
    long permissions();
    int color();
    boolean hoist();
    boolean mentionable();
}
