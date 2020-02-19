package com.discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebhookCreateRequest.class)
public interface WebhookCreateRequest {

    String name();
    Optional<String> avatar();
}
