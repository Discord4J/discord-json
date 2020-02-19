package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableUserData.class)
public interface UserData {

    String id();

    String username();

    String discriminator();

    Optional<String> avatar();

    Possible<Boolean> bot();

    Possible<Boolean> system();

    @JsonProperty("mfa_enabled")
    Possible<Boolean> mfaEnabled();

    Possible<String> locale();

    Possible<Boolean> verified();

    Possible<String> email();

    Possible<Integer> flags();

    @JsonProperty("premium_type")
    Possible<Integer> premiumType();
}
