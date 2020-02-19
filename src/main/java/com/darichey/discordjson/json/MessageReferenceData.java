package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageReferenceData.class)
public interface MessageReferenceData {

    @JsonProperty("message_id")
    default Possible<String> messageId() { return Possible.absent(); }

    @JsonProperty("channel_id")
    default Possible<String> channelId() { return Possible.absent(); }

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
}
