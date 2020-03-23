package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIdentify.class)
@JsonDeserialize(as = ImmutableIdentify.class)
public interface Identify extends PayloadData {

    String token();
    IdentifyProperties properties();
    default Possible<Boolean> compress() { return Possible.absent(); }
    @JsonProperty("large_threshold")
    int largeThreshold();
    default Possible<int[]> shard() { return Possible.absent(); }
    default Possible<StatusUpdate> presence() { return Possible.absent(); }
    @JsonProperty("guild_subscriptions")
    default Possible<Boolean> guildSubscriptions() { return Possible.absent(); }
    default Possible<Long> intents() { return Possible.absent(); }
}
