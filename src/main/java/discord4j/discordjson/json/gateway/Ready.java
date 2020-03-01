package discord4j.discordjson.json.gateway;

import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.json.UnavailableGuildData;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableReady.class)
public interface Ready extends Dispatch {

    int v();
    UserData user();
    @JsonProperty("private_channels")
    List<ChannelData> privateChannels();
    List<UnavailableGuildData> guilds();
    @JsonProperty("session_id")
    String sessionId();
    default Possible<int[]> shard() { return Possible.absent(); }
    @JsonProperty("_trace")
    List<String> trace();
}
