package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePositionModifyRequest.class)
@JsonDeserialize(as = ImmutablePositionModifyRequest.class)
public interface PositionModifyRequest {

    String id();
    int position();
}
