package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableConnectionData.class)
public interface ConnectionData {

    String id();
    String name();
    String type();
    boolean revoked();
    List<IntegrationData> integrations();
    boolean verified();
    @JsonProperty("friend_sync")
    boolean friendSync();
    @JsonProperty("show_activity")
    boolean showActivity();
    int visibility();
}
