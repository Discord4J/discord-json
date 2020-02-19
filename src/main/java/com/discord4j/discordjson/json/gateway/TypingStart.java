package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.MemberData;
import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableTypingStart.class)
public interface TypingStart extends Dispatch {

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    Possible<String> guildId();

    @JsonProperty("user_id")
    String userId();

    int timestamp();

    Possible<MemberData> member();
}
