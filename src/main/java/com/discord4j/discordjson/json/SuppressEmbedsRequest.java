package com.discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableSuppressEmbedsRequest.class)
public interface SuppressEmbedsRequest {

    boolean suppress();
}
