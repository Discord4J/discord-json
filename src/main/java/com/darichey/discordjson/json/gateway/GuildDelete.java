package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.UnavailableGuildData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildDelete.class)
public interface GuildDelete extends Dispatch {

    @JsonUnwrapped
    UnavailableGuildData guild();
}
