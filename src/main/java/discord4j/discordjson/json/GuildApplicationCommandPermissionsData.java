package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildApplicationCommandPermissionsData.class)
@JsonDeserialize(as = ImmutableGuildApplicationCommandPermissionsData.class)
public interface GuildApplicationCommandPermissionsData {

    static ImmutableGuildApplicationCommandPermissionsData.Builder builder() {
        return ImmutableGuildApplicationCommandPermissionsData.builder();
    }

    String id();

    @JsonProperty("application_id")
    String applicationId();

    @JsonProperty("guild_id")
    String guildId();

    List<ApplicationCommandPermissionsData> permissions();

}
