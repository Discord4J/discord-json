package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRequestGuildMembers.class)
@JsonDeserialize(as = ImmutableRequestGuildMembers.class)
public interface RequestGuildMembers extends PayloadData {

    static ImmutableRequestGuildMembers.Builder builder() {
        return ImmutableRequestGuildMembers.builder();
    }

    @JsonProperty("guild_id")
    String guildId();

    Possible<? extends String> query();

    int limit();

    Possible<? extends Boolean> presences();

    @JsonProperty("user_ids")
    Possible<? extends String> userIds();

    Possible<? extends String> nonce();
}
