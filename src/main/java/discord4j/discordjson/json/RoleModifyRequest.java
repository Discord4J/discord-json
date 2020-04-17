package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleModifyRequest.class)
@JsonDeserialize(as = ImmutableRoleModifyRequest.class)
public interface RoleModifyRequest {

    Possible<String> name();
    Possible<Long> permissions();
    Possible<Integer> color();
    Possible<Boolean> hoist();
    Possible<Boolean> mentionable();
}
