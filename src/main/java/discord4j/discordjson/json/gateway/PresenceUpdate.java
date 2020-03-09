package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ActivityData;
import discord4j.discordjson.json.ClientStatusData;
import discord4j.discordjson.json.PartialUserData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePresenceUpdate.class)
@JsonDeserialize(as = ImmutablePresenceUpdate.class)
public interface PresenceUpdate extends Dispatch {

    PartialUserData user();

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
