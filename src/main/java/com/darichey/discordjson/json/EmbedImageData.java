package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedImageData.class)
public interface EmbedImageData {

    Possible<String> url();

    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    Possible<Integer> height();

    Possible<Integer> width();
}
