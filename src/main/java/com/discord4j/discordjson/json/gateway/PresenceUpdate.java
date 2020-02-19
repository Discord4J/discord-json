package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.ActivityData;
import com.discord4j.discordjson.json.ClientStatusData;
import com.discord4j.discordjson.json.UserData;
import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutablePresenceUpdate.class)
public interface PresenceUpdate extends Dispatch {

    UserData user();

    List<String> roles();

    Optional<ActivityData> game();

    @JsonProperty("guild_id")
    String guildId();

    String status();

    List<ActivityData> activities();

    @JsonProperty("client_status")
    ClientStatusData clientStatus();

    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    Possible<Optional<String>> nick();
}
