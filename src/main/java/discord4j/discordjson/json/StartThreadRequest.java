package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStartThreadRequest.class)
@JsonDeserialize(as = ImmutableStartThreadRequest.class)
public interface StartThreadRequest {

    static ImmutableStartThreadRequest.Builder builder() {
        return ImmutableStartThreadRequest.builder();
    }

    String name();

    @JsonProperty("auto_archive_duration")
    int autoArchiveDuration();
}
