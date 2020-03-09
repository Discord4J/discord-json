package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhooksUpdate.class)
@JsonDeserialize(as = ImmutableWebhooksUpdate.class)
public interface WebhooksUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    @JsonProperty("channel_id")
    String channelId();
}
