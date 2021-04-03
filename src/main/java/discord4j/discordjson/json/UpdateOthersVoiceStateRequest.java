package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUpdateOthersVoiceStateRequest.class)
@JsonDeserialize(as = ImmutableUpdateOthersVoiceStateRequest.class)
public interface UpdateOthersVoiceStateRequest {

    static ImmutableUpdateOthersVoiceStateRequest.Builder builder() {
        return ImmutableUpdateOthersVoiceStateRequest.builder();
    }

    @JsonProperty("channel_id")
    String channelId();

    Possible<Boolean> suppress();

}
