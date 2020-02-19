package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.UnavailableGuildData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildDelete.class)
public interface GuildDelete extends Dispatch {

    @JsonUnwrapped
    UnavailableGuildData guild();
}
