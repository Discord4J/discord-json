package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.ActivityData;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableStatusUpdate.class)
public interface StatusUpdate extends PayloadData {

    Optional<Integer> since();
    Optional<ActivityData> game();
    String status();
    boolean afk();
}
