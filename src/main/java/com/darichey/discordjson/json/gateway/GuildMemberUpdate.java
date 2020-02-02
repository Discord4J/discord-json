package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.UserData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberUpdate.class)
public interface GuildMemberUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    List<String> roles();
    UserData user();
    String nick();
}
