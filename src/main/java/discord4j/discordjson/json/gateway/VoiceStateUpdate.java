package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.VoiceStateData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateUpdate.class)
@JsonDeserialize(as = ImmutableVoiceStateUpdate.class)
public interface VoiceStateUpdate extends PayloadData {

    static ImmutableVoiceStateUpdate.Builder builder() {
        return ImmutableVoiceStateUpdate.builder();
    }

    @JsonUnwrapped
    VoiceStateData voiceStateData();

}
