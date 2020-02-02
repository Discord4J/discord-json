package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebhookModifyRequest.class)
public interface WebhookModifyRequest {

    Possible<String> name();
    Possible<String> avatar();
    @JsonProperty("channel_id")
    Possible<String> channelId();
}
