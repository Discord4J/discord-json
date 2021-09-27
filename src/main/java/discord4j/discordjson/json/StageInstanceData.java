package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceData.class)
@JsonDeserialize(as = ImmutableStageInstanceData.class)
public interface StageInstanceData {

    static ImmutableStageInstanceData.Builder builder() {
        return ImmutableStageInstanceData.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("channel_id")
    Id channelId();

    String topic();

    @JsonProperty("privacy_level")
    int privacyLevel();

    @JsonProperty("discovery_disabled")
    boolean discoveryDisabled();

}
