package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableReactionCountDetailsData.class)
@JsonDeserialize(as = ImmutableReactionCountDetailsData.class)
public interface ReactionCountDetailsData {

    static ImmutableReactionCountDetailsData.Builder builder() {
        return ImmutableReactionCountDetailsData.builder();
    }

    int normal();

    int burst();

}
