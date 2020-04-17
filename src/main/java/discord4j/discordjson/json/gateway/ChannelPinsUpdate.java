package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelPinsUpdate.class)
@JsonDeserialize(as = ImmutableChannelPinsUpdate.class)
public interface ChannelPinsUpdate extends Dispatch {

    @JsonProperty("guild_id")
    Possible<String> guildId();
    @JsonProperty("channel_id")
    String channelId();
    @JsonProperty("last_pin_timestamp")
    Possible<String> lastPinTimestamp();
}
