package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleColorRequest.class)
@JsonDeserialize(as = ImmutableRoleColorRequest.class)
public interface RoleColorRequest {

    static ImmutableRoleColorRequest.Builder builder() {
        return ImmutableRoleColorRequest.builder();
    }

    @JsonProperty("primary_color")
    Possible<Optional<Integer>> primaryColor();

    @JsonProperty("secondary_color")
    Possible<Optional<Integer>> secondaryColor();

    @JsonProperty("tertiary_color")
    Possible<Optional<Integer>> tertiaryColor();

}
