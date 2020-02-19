package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.RoleData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildRoleUpdate.class)
public interface GuildRoleUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    RoleData role();
}
