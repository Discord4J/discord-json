package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceChannelStatusUpdate.class)
@JsonDeserialize(as = ImmutableVoiceChannelStatusUpdate.class)
public interface VoiceChannelStatusUpdate extends Dispatch {

    static ImmutableVoiceChannelStatusUpdate.Builder builder() {
        return ImmutableVoiceChannelStatusUpdate.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    Optional<String> status();
}
