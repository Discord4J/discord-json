package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildBanAdd.class)
@JsonDeserialize(as = ImmutableGuildBanAdd.class)
public interface GuildBanAdd extends Dispatch {

    static ImmutableGuildBanAdd.Builder builder() {
        return ImmutableGuildBanAdd.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    UserData user();
}
