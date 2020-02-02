package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.UserData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildBanRemove.class)
public interface GuildBanRemove extends Dispatch {

    @JsonProperty("guild_id")
    String guild();
    UserData user();
}
