package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandPermissionsRequest.class)
@JsonDeserialize(as = ImmutableApplicationCommandPermissionsRequest.class)
public interface ApplicationCommandPermissionsRequest {

    static ImmutableApplicationCommandPermissionsRequest.Builder builder() {
        return ImmutableApplicationCommandPermissionsRequest.builder();
    }

    List<ApplicationCommandPermissionsData> permissions();

}
