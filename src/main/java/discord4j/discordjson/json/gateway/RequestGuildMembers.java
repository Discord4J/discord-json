package discord4j.discordjson.json.gateway;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableRequestGuildMembers.class)
public interface RequestGuildMembers extends PayloadData {

    @JsonProperty("guild_id")
    String guildId();
    default Possible<String> query() { return Possible.absent(); }
    int limit();
    default Possible<Boolean> presences() { return Possible.absent(); }
    @JsonProperty("user_ids")
    default Possible<Boolean> userIds() { return Possible.absent(); }
}
