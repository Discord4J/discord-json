package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePinnedMessagesResponseData.class)
@JsonDeserialize(as = ImmutablePinnedMessagesResponseData.class)
public interface PinnedMessagesResponseData {

    static ImmutablePinnedMessagesResponseData.Builder builder() {
        return ImmutablePinnedMessagesResponseData.builder();
    }

    List<PinnedMessageData> items();

    @JsonProperty("has_more")
    boolean hasMore();
}
