package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutablePositionModifyRequest.class)
public interface PositionModifyRequest {

    String id();
    int position();
}
