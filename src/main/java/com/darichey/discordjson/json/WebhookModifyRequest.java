package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebhookModifyRequest.class)
public interface WebhookModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<String> avatar() { return Possible.absent(); }
    @JsonProperty("channel_id")
    default Possible<String> channelId() { return Possible.absent(); }
}
