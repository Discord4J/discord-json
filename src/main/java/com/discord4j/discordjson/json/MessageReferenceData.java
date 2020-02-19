package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageReferenceData.class)
public interface MessageReferenceData {

    @JsonProperty("message_id")
    Possible<String> messageId();

    @JsonProperty("channel_id")
    Possible<String> channelId();

    @JsonProperty("guild_id")
    Possible<String> guildId();
}
