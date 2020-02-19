package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedVideoData.class)
public interface EmbedVideoData {

    default Possible<String> url() { return Possible.absent(); }

    default Possible<Integer> height() { return Possible.absent(); }

    default Possible<Integer> width() { return Possible.absent(); }
}
