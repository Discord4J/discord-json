package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.RoleData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildRoleUpdate.class)
@JsonDeserialize(as = ImmutableGuildRoleUpdate.class)
public interface GuildRoleUpdate extends Dispatch {

    static ImmutableGuildRoleUpdate.Builder builder() {
        return ImmutableGuildRoleUpdate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    RoleData role();
}
