package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInvalidSession.class)
@JsonDeserialize(as = ImmutableInvalidSession.class)
public interface InvalidSession extends PayloadData {

    boolean resumable();
}
