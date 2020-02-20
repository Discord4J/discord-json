package discord4j.discordjson.json.gateway;

import discord4j.discordjson.json.RoleData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildRoleCreate.class)
public interface GuildRoleCreate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    RoleData role();
}
