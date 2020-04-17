package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhooksUpdate.class)
@JsonDeserialize(as = ImmutableWebhooksUpdate.class)
public interface WebhooksUpdate extends Dispatch {

    static ImmutableWebhooksUpdate.Builder builder() {
        return ImmutableWebhooksUpdate.builder();
    }

    @JsonProperty("guild_id")
    String guildId();
    @JsonProperty("channel_id")
    String channelId();
}
