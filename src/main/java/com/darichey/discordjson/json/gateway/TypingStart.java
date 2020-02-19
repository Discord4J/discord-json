package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.MemberData;
import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableTypingStart.class)
public interface TypingStart extends Dispatch {

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }

    @JsonProperty("user_id")
    String userId();

    int timestamp();

    default Possible<MemberData> member() { return Possible.absent(); }
}
