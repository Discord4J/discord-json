package discord4j.discordjson.json.gateway;

import discord4j.discordjson.json.ActivityData;
import discord4j.discordjson.json.ClientStatusData;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutablePresenceUpdate.class)
public interface PresenceUpdate extends Dispatch {

    UserData user();

    List<String> roles();

    Optional<ActivityData> game();

    @JsonProperty("guild_id")
    String guildId();

    String status();

    List<ActivityData> activities();

    @JsonProperty("client_status")
    ClientStatusData clientStatus();

    @JsonProperty("premium_since")
    default Possible<Optional<String>> premiumSince() { return Possible.absent(); }

    default Possible<Optional<String>> nick() { return Possible.absent(); }
}
