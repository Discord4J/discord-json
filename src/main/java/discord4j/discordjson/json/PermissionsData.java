package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePermissionsData.class)
@JsonDeserialize(as = ImmutablePermissionsData.class)
public interface PermissionsData {
    static ImmutablePermissionsData.Builder builder() {
        return ImmutablePermissionsData.builder();
    }

    String permissions();
}
