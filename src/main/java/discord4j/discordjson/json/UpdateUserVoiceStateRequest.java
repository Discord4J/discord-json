package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUpdateUserVoiceStateRequest.class)
@JsonDeserialize(as = ImmutableUpdateUserVoiceStateRequest.class)
public interface UpdateUserVoiceStateRequest {

    static ImmutableUpdateUserVoiceStateRequest.Builder builder() {
        return ImmutableUpdateUserVoiceStateRequest.builder();
    }

    @JsonProperty("channel_id")
    String channelId();

    Possible<Boolean> suppress();

     @JsonProperty("request_to_speak_timestamp")
    Possible<String> requestToSpeakTimestamp();

}
