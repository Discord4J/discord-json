package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberModifyRequest.class)
public interface GuildMemberModifyRequest {

    Possible<String> nick();
    Possible<List<String>> roles();
    Possible<Boolean> mute();
    Possible<Boolean> deaf();
    @JsonProperty("channel_id")
    Optional<String> channelId();
}
