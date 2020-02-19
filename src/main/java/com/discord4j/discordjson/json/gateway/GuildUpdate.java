package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.GuildData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildUpdate.class)
public interface GuildUpdate extends Dispatch {

    @JsonUnwrapped
    GuildData guild();
}
