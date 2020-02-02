package com.darichey.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildIntegrationsUpdate.class)
public interface GuildIntegrationsUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guild();
}
