package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.EmojiData;
import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageReactionRemove.class)
public interface MessageReactionRemove extends Dispatch {

    @JsonProperty("user_id")
    String userId();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("message_id")
    String messageId();

    @JsonProperty("guild_id")
    Possible<String> guildId();

    EmojiData emoji();
}
