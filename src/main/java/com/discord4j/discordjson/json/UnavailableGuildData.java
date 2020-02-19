package com.discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUnavailableGuildData.class)
public interface UnavailableGuildData {

    String id();
    boolean unavailable();
}
