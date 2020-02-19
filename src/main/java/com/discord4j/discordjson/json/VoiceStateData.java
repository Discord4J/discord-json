package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableVoiceStateData.class)
public interface VoiceStateData {

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

    boolean suppress();
}
