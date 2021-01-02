package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.json.PartialApplicationInfoData;
import discord4j.discordjson.json.UnavailableGuildData;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableReady.class)
@JsonDeserialize(as = ImmutableReady.class)
public interface Ready extends Dispatch {

    static ImmutableReady.Builder builder() {
        return ImmutableReady.builder();
    }

    int v();
    UserData user();
    @JsonProperty("private_channels")
    List<ChannelData> privateChannels();
    List<UnavailableGuildData> guilds();
    @JsonProperty("session_id")
    String sessionId();
    Possible<int[]> shard();
    @JsonProperty("_trace")
    List<String> trace();
    PartialApplicationInfoData application();
}
