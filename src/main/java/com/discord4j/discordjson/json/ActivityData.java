package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityData.class)
public interface ActivityData {

    String name();

    int type();

    Possible<Optional<String>> url();

    @JsonProperty("created_at")
    int createdAt();

    Possible<ActivityTimestampsData> timestamps();

    @JsonProperty("application_id")
    Possible<String> applicationId();

    Possible<Optional<String>> details();

    Possible<Optional<String>> state();

    Possible<Optional<ActivityEmojiData>> emoji();

    Possible<ActivityPartyData> party();

    Possible<ActivityAssetsData> assets();

    Possible<ActivitySecretsData> secrets();

    Possible<Boolean> instance();

    Possible<Integer> flags();
}
