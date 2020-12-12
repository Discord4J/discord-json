package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableRequestGuildMembers.class)
@JsonDeserialize(as = ImmutableRequestGuildMembers.class)
public interface RequestGuildMembers extends PayloadData {

    static ImmutableRequestGuildMembers.Builder builder() {
        return ImmutableRequestGuildMembers.builder();
    }

    @JsonProperty("guild_id")
    String guildId();

    Possible<String> query();

    int limit();

    Possible<Boolean> presences();

    @JsonProperty("user_ids")
    Possible<List<String>> userIds();

    Possible<String> nonce();
}
