package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ActivityData;
import discord4j.discordjson.json.ClientStatusData;
import discord4j.discordjson.json.PartialUserData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutablePresenceUpdate.class)
@JsonDeserialize(as = ImmutablePresenceUpdate.class)
public interface PresenceUpdate extends Dispatch {

    static ImmutablePresenceUpdate.Builder builder() {
        return ImmutablePresenceUpdate.builder();
    }

    PartialUserData user();

    @JsonProperty("guild_id")
    Id guildId();

    String status();

    List<ActivityData> activities();

    @JsonProperty("client_status")
    ClientStatusData clientStatus();

}
