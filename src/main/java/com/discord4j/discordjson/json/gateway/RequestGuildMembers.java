package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRequestGuildMembers.class)
public interface RequestGuildMembers extends PayloadData {

    @JsonProperty("guild_id")
    String guildId();
    Possible<String> query();
    int limit();
    Possible<Boolean> presences();
    @JsonProperty("user_ids")
    Possible<Boolean> userIds();
}
