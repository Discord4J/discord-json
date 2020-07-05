package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@Value.Style(builder = "new",
        jacksonIntegration = false,
        allParameters = true)
@JsonSerialize(as = ImmutableInvalidSession.class)
@JsonDeserialize(as = ImmutableInvalidSession.class)
public interface InvalidSession extends PayloadData {

    static ImmutableInvalidSession.Builder builder() {
        return new ImmutableInvalidSession.Builder();
    }

    boolean resumable();
}
