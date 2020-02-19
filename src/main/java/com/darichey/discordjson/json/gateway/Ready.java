package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.ChannelData;
import com.darichey.discordjson.json.UnavailableGuildData;
import com.darichey.discordjson.json.UserData;
import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableReady.class)
public interface Ready extends Dispatch {

    int v();
    UserData user();
    @JsonProperty("private_channels")
    List<ChannelData> privateChannels();
    List<UnavailableGuildData> guilds();
    @JsonProperty("session_id")
    String sessionId();
    default Possible<int[]> shard() { return Possible.absent(); }
}
