package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildRoleDelete.class)
@JsonDeserialize(as = ImmutableGuildRoleDelete.class)
public interface GuildRoleDelete extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("role_id")
    String roleId();
}
