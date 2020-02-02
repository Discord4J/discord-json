package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableIntegrationAccountData.class)
public interface IntegrationAccountData {

    String id();

    String name();
}
