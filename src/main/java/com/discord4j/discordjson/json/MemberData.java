package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMemberData.class)
public interface MemberData {

    UserData user();

    Possible<String> nick();

    List<String> roles();

    @JsonProperty("joined_at")
    String joinedAt();

    @JsonProperty("premium_since")
    Optional<String> premiumSince();

    boolean deaf();

    boolean mute();
}
