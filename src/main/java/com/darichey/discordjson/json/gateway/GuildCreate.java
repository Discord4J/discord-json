package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.GuildData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildCreate.class)
public interface GuildCreate extends Dispatch {

    @JsonUnwrapped
    GuildData guild();
}
