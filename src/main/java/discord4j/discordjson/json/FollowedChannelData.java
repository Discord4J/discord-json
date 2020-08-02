package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableFollowedChannelData.class)
@JsonDeserialize(as = ImmutableFollowedChannelData.class)
public interface FollowedChannelData {

    static ImmutableFollowedChannelData.Builder builder() {
        return ImmutableFollowedChannelData.builder();
    }

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("webhook_id")
    String webhookId();
}
