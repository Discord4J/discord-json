package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRoleModifyRequest.class)
public interface RoleModifyRequest {

    Possible<String> name();
    Possible<Long> permissions();
    Possible<Integer> color();
    Possible<Boolean> hoist();
    Possible<Boolean> mentionable();
}
