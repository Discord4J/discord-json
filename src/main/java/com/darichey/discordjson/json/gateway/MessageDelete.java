package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageDelete.class)
public interface MessageDelete extends Dispatch {

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
}
