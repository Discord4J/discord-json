package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberUpdate.class)
@JsonDeserialize(as = ImmutableGuildMemberUpdate.class)
public interface GuildMemberUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();
    List<String> roles();
    UserData user();
    default Possible<Optional<String>> nick() { return Possible.absent(); }
    @JsonProperty("premium_since")
    default Possible<Optional<String>> premiumSince() { return Possible.absent(); }
}
