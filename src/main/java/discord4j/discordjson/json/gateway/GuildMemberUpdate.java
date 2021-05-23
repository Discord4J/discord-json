package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberUpdate.class)
@JsonDeserialize(as = ImmutableGuildMemberUpdate.class)
public interface GuildMemberUpdate extends Dispatch {

    static ImmutableGuildMemberUpdate.Builder builder() {
        return ImmutableGuildMemberUpdate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    List<String> roles();

    UserData user();

    Possible<Optional<String>> nick();

    @JsonProperty("joined_at")
    Optional<String> joinedAt();

    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    Possible<Boolean> pending();

}
