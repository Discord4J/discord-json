package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.VoiceStateData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableVoiceStateUpdateDispatch.class)
public interface VoiceStateUpdateDispatch extends Dispatch {

    @JsonUnwrapped
    VoiceStateData voiceState();
}
