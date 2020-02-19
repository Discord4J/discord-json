package com.discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebhooksUpdate.class)
public interface WebhooksUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    @JsonProperty("channel_id")
    String channelId();
}
