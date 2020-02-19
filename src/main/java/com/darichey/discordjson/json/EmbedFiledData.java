package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedFiledData.class)
public interface EmbedFiledData {

    String name();

    String value();

    Possible<Boolean> inline();
}
