package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmbedModifyRequest.class)
public interface GuildEmbedModifyRequest {

    Possible<Boolean> enabled();
    @JsonProperty("channel_id")
    Possible<Optional<String>> channelId();
}
