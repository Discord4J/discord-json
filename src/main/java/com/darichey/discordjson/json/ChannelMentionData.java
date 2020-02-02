package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelMentionData.class)
public interface ChannelMentionData {

    String id();

    @JsonProperty("guild_id")
    String guildId();

    int type();

    String name();
}
