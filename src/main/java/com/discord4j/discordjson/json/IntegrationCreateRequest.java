package com.discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableIntegrationCreateRequest.class)
public interface IntegrationCreateRequest {

    String type();
    String id();
}
