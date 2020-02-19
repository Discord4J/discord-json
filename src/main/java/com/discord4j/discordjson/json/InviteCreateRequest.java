package com.discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInviteCreateRequest.class)
public interface InviteCreateRequest {

    @JsonProperty("max_age")
    int maxAge();
    @JsonProperty("max_uses")
    int maxUses();
    boolean temporary();
    boolean unique();
}
