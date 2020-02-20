package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutablePartialChannelCreateRequest.class)
public interface PartialChannelCreateRequest {

    String name();
    int type();
}
