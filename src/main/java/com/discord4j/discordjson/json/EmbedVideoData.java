package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedVideoData.class)
public interface EmbedVideoData {

    Possible<String> url();

    Possible<Integer> height();

    Possible<Integer> width();
}
