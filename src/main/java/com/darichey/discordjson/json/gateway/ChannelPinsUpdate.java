package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelPinsUpdate.class)
public interface ChannelPinsUpdate extends Dispatch {

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
    @JsonProperty("channel_id")
    String channelId();
    @JsonProperty("last_pin_timestamp")
    String lastPinTimestamp();
}
