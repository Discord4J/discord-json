package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialGuildApplicationCommandPermissionsData.class)
@JsonDeserialize(as = ImmutablePartialGuildApplicationCommandPermissionsData.class)
public interface PartialGuildApplicationCommandPermissionsData {

    static ImmutablePartialGuildApplicationCommandPermissionsData.Builder builder() {
        return ImmutablePartialGuildApplicationCommandPermissionsData.builder();
    }

    String id();

    List<ApplicationCommandPermissionsData> permissions();

}
