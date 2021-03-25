package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.RoleData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildRoleCreate.class)
@JsonDeserialize(as = ImmutableGuildRoleCreate.class)
public interface GuildRoleCreate extends Dispatch {

    static ImmutableGuildRoleCreate.Builder builder() {
        return ImmutableGuildRoleCreate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    RoleData role();
}
