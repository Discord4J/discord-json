package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableRolePositionModifyRequest.class)
@JsonDeserialize(as = ImmutableRolePositionModifyRequest.class)
public interface RolePositionModifyRequest {

    static ImmutableRolePositionModifyRequest.Builder builder() {
        return ImmutableRolePositionModifyRequest.builder();
    }

    String id();

    Possible<Optional<Integer>> position();

}
