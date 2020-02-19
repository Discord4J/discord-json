package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableIdentify.class)
public interface Identify extends PayloadData {

    String token();
    IdentifyProperties properties();
    Possible<Boolean> compress();
    @JsonProperty("large_threshold")
    int largeThreshold();
    Possible<int[]> shard();
    Possible<StatusUpdate> presence();
    @JsonProperty("guild_subscriptions")
    Possible<Boolean> guildSubscriptions();
}
