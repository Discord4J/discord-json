package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildRoleDelete.class)
public interface GuildRoleDelete extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("role_id")
    String roleId();
}
