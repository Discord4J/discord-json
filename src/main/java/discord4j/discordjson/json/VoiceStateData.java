package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceStateData.class)
@JsonDeserialize(as = ImmutableVoiceStateData.class)
public interface VoiceStateData {

    static ImmutableVoiceStateData.Builder builder() {
        return ImmutableVoiceStateData.builder();
    }

    @JsonProperty("guild_id")
    Possible<String> guildId();

    @JsonProperty("channel_id")
    Optional<String> channelId();

    @JsonProperty("user_id")
    String userId();

    Possible<MemberData> member();

    @JsonProperty("session_id")
    String sessionId();

    boolean deaf();

    boolean mute();

    @JsonProperty("self_deaf")
    boolean selfDeaf();

    @JsonProperty("self_mute")
    boolean selfMute();

    @JsonProperty("self_stream")
    Possible<Boolean> selfStream();

    @JsonProperty("self_video")
    boolean selfVideo();

    boolean suppress();
}
