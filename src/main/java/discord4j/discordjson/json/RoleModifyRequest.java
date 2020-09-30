package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleModifyRequest.class)
@JsonDeserialize(as = ImmutableRoleModifyRequest.class)
public interface RoleModifyRequest {

    static ImmutableRoleModifyRequest.Builder builder() {
        return ImmutableRoleModifyRequest.builder();
    }

    Possible<String> name();
    Possible<String> permissions();
    Possible<Integer> color();
    Possible<Boolean> hoist();
    Possible<Boolean> mentionable();
}
