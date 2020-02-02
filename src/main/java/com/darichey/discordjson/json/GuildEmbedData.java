package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmbedData.class)
public interface GuildEmbedData {

    boolean enabled();
    @JsonProperty("channel_id")
    Optional<String> channelId();
}
