package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceChannelStartTimeUpdate.class)
@JsonDeserialize(as = ImmutableVoiceChannelStartTimeUpdate.class)
public interface VoiceChannelStartTimeUpdate extends Dispatch {

    static ImmutableVoiceChannelStartTimeUpdate.Builder builder() {
        return ImmutableVoiceChannelStartTimeUpdate.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("voice_start_time")
    Optional<Integer> voiceStartTime();
}
