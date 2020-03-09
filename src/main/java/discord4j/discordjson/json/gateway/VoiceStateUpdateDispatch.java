package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.VoiceStateData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateUpdateDispatch.class)
@JsonDeserialize(as = ImmutableVoiceStateUpdateDispatch.class)
public interface VoiceStateUpdateDispatch extends Dispatch {

    @JsonUnwrapped
    VoiceStateData voiceState();
}
