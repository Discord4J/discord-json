package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateUpdate.class)
@JsonDeserialize(as = ImmutableVoiceStateUpdate.class)
public interface VoiceStateUpdate extends PayloadData {

    @JsonProperty("guild_id")
    String guildId();
    @JsonProperty("channel_id")
    Optional<String> channelId();
    @JsonProperty("self_mute")
    boolean selfMute();
    @JsonProperty("self_deaf")
    boolean selfDeaf();
}
