package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateUpdate.class)
@JsonDeserialize(as = ImmutableVoiceStateUpdate.class)
public interface VoiceStateUpdate extends PayloadData {

    static ImmutableVoiceStateUpdate.Builder builder() {
        return ImmutableVoiceStateUpdate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    @JsonProperty("channel_id")
    Optional<Id> channelId();
    @JsonProperty("self_mute")
    boolean selfMute();
    @JsonProperty("self_deaf")
    boolean selfDeaf();
}
