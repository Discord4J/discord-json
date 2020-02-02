package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.MemberData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberAdd.class)
public interface GuildMemberAdd extends Dispatch {

    @JsonProperty("guild_id")
    String guild();
    @JsonUnwrapped
    MemberData member();
}
