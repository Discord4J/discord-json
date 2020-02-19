package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.MemberData;
import com.discord4j.discordjson.possible.Possible;
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
