package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleCreateRequest.class)
@JsonDeserialize(as = ImmutableRoleCreateRequest.class)
public interface RoleCreateRequest {

    static ImmutableRoleCreateRequest.Builder builder() {
        return ImmutableRoleCreateRequest.builder();
    }

    Possible<? extends String> name();
    Possible<? extends Long> permissions();
    Possible<? extends Integer> color();
    Possible<? extends Boolean> hoist();
    Possible<? extends Boolean> mentionable();
}
