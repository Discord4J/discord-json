package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleCreateRequest.class)
@JsonDeserialize(as = ImmutableRoleCreateRequest.class)
public interface RoleCreateRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<Long> permissions() { return Possible.absent(); }
    default Possible<Integer> color() { return Possible.absent(); }
    default Possible<Boolean> hoist() { return Possible.absent(); }
    default Possible<Boolean> mentionable() { return Possible.absent(); }
}
