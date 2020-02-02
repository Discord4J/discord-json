package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableApplicationTeamMemberData.class)
public interface ApplicationTeamMemberData {

    @JsonProperty("membership_state")
    int membershipState();
    List<String> permissions();
    @JsonProperty("team_id")
    String teamId();
    UserData user();
}
