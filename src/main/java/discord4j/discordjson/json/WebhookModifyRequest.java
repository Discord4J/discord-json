package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookModifyRequest.class)
@JsonDeserialize(as = ImmutableWebhookModifyRequest.class)
public interface WebhookModifyRequest {

    static ImmutableWebhookModifyRequest.Builder builder() {
        return ImmutableWebhookModifyRequest.builder();
    }

    Possible<? extends String> name();
    Possible<? extends String> avatar();
    @JsonProperty("channel_id")
    Possible<? extends String> channelId();
}
