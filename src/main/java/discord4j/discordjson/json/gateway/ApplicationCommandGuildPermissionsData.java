package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandGuildPermissionsData.class)
@JsonDeserialize(as = ImmutableApplicationCommandGuildPermissionsData.class)
public interface ApplicationCommandGuildPermissionsData {

    static ImmutableApplicationCommandGuildPermissionsData.Builder builder() {
        return ImmutableApplicationCommandGuildPermissionsData.builder();
    }

    Id id();

    @JsonProperty("application_id")
    Id applicationId();

    @JsonProperty("guild_id")
    Id guildId();

    List<ApplicationCommandPermissionsData> permissions();
}
