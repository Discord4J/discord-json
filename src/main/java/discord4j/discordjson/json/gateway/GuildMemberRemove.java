package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberRemove.class)
@JsonDeserialize(as = ImmutableGuildMemberRemove.class)
public interface GuildMemberRemove extends Dispatch {

    static ImmutableGuildMemberRemove.Builder builder() {
        return ImmutableGuildMemberRemove.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    UserData user();
}
