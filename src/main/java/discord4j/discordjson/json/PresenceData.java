package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePresenceData.class)
@JsonDeserialize(as = ImmutablePresenceData.class)
public interface PresenceData {

    static ImmutablePresenceData.Builder builder() {
        return ImmutablePresenceData.builder();
    }

    PartialUserData user();

    String status();

    List<ActivityData> activities();

    @JsonProperty("client_status")
    ClientStatusData clientStatus();

}
