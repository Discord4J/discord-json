package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelModifyRequest.class)
public interface ChannelModifyRequest {

    Possible<String> name();
    Possible<Integer> position();
    Possible<String> topic();
    Possible<Boolean> nsfw();
    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();
    Possible<Integer> bitrate();
    @JsonProperty("user_limit")
    Possible<Integer> userLimit();
    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();
    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();
}
