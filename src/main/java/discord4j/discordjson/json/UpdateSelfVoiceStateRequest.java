package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableUpdateSelfVoiceStateRequest.class)
@JsonDeserialize(as = ImmutableUpdateSelfVoiceStateRequest.class)
public interface UpdateSelfVoiceStateRequest {

    static ImmutableUpdateSelfVoiceStateRequest.Builder builder() {
        return ImmutableUpdateSelfVoiceStateRequest.builder();
    }

    @JsonProperty("channel_id")
    String channelId();

    Possible<Boolean> suppress();

    @JsonProperty("request_to_speak_timestamp")
    Possible<Optional<String>> requestToSpeakTimestamp();

}
