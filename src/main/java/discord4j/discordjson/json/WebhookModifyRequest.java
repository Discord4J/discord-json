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

    default Possible<String> name() { return Possible.absent(); }
    default Possible<String> avatar() { return Possible.absent(); }
    @JsonProperty("channel_id")
    default Possible<String> channelId() { return Possible.absent(); }
}
