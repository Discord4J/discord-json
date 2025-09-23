package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePinnedMessageData.class)
@JsonDeserialize(as = ImmutablePinnedMessageData.class)
public interface PinnedMessageData {

    static ImmutablePinnedMessageData.Builder builder() {
        return ImmutablePinnedMessageData.builder();
    }

    @JsonProperty("pinned_at")
    String pinnedAt();

    MessageData message();

}
