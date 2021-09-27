package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStageInstanceCreateRequest.class)
@JsonDeserialize(as = ImmutableStageInstanceCreateRequest.class)
public interface StageInstanceCreateRequest {

    static ImmutableStageInstanceCreateRequest.Builder builder() {
        return ImmutableStageInstanceCreateRequest.builder();
    }

    @JsonProperty("channel_id")
    Id channelId();

    String topic();

    @JsonProperty("privacy_level")
    Possible<Integer> privacyLevel();



}
