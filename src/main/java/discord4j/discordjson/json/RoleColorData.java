package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleColorData.class)
@JsonDeserialize(as = ImmutableRoleColorData.class)
public interface RoleColorData {

    static ImmutableRoleColorData.Builder builder() {
        return ImmutableRoleColorData.builder();
    }

    @JsonProperty("primary_color")
    int primaryColor();

    @JsonProperty("secondary_color")
    Optional<Integer> secondaryColor();

    @JsonProperty("tertiary_color")
    Optional<Integer> tertiaryColor();

}
