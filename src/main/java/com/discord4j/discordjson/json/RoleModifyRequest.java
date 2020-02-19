package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRoleModifyRequest.class)
public interface RoleModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<Long> permissions() { return Possible.absent(); }
    default Possible<Integer> color() { return Possible.absent(); }
    default Possible<Boolean> hoist() { return Possible.absent(); }
    default Possible<Boolean> mentionable() { return Possible.absent(); }
}
