package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModActionData.class)
@JsonDeserialize(as = ImmutableAutoModActionData.class)
public interface AutoModActionData {

    static ImmutableAutoModActionData.Builder builder() {
        return ImmutableAutoModActionData.builder();
    }

    @JsonProperty("action_type")
    int actionType();

    Object metadata();

}
