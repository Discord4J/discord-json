package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleModifyRequest.class)
@JsonDeserialize(as = ImmutableRoleModifyRequest.class)
public interface RoleModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<Long> permissions() { return Possible.absent(); }
    default Possible<Integer> color() { return Possible.absent(); }
    default Possible<Boolean> hoist() { return Possible.absent(); }
    default Possible<Boolean> mentionable() { return Possible.absent(); }
}
