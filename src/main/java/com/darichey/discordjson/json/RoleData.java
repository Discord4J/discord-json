package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRoleData.class)
public interface RoleData {

    String id();

    String name();

    int color();

    boolean hoist();

    int position();

    long permissions();

    boolean managed();

    boolean mentionable();
}
