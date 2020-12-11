package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildRoleDelete.class)
@JsonDeserialize(as = ImmutableGuildRoleDelete.class)
public interface GuildRoleDelete extends Dispatch {

    static ImmutableGuildRoleDelete.Builder builder() {
        return ImmutableGuildRoleDelete.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    @JsonProperty("role_id")
    Id roleId();
}
