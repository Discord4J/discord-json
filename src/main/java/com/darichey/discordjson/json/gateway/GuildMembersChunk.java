package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.MemberData;
import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMembersChunk.class)
public interface GuildMembersChunk extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    List<MemberData> members();
    @JsonProperty("not_found")
    default Possible<List<String>> notFound() { return Possible.absent(); }
    default Possible<PresenceUpdate> presences() { return Possible.absent(); }

}
