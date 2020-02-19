package com.discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInvalidSession.class)
public interface InvalidSession extends PayloadData {

    boolean resumable();
}
