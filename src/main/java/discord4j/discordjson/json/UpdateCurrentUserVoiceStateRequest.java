package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableUpdateCurrentUserVoiceStateRequest.class)
@JsonDeserialize(as = ImmutableUpdateCurrentUserVoiceStateRequest.class)
public interface UpdateCurrentUserVoiceStateRequest {

    static ImmutableUpdateCurrentUserVoiceStateRequest.Builder builder() {
        return ImmutableUpdateCurrentUserVoiceStateRequest.builder();
    }

    @JsonProperty("channel_id")
    Possible<String> channelId();

    Possible<Boolean> suppress();

    @JsonProperty("request_to_speak_timestamp")
    Possible<Optional<String>> requestToSpeakTimestamp();

}
