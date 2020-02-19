package com.discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableOverwriteData.class)
public interface OverwriteData {

    String id();

    String type();

    long allow();

    long deny();
}
