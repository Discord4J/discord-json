package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableNewsChannelFollowRequest.class)
@JsonDeserialize(as = ImmutableNewsChannelFollowRequest.class)
public interface NewsChannelFollowRequest {

    static ImmutableNewsChannelFollowRequest.Builder builder() {
        return ImmutableNewsChannelFollowRequest.builder();
    }

    @JsonProperty("webhook_channel_id")
    Id webhookChannelId();
}
