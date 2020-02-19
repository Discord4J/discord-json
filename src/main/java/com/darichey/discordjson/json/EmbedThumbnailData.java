package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedThumbnailData.class)
public interface EmbedThumbnailData {

    default Possible<String> url() { return Possible.absent(); }

    @JsonProperty("proxy_url")
    default Possible<String> proxyUrl() { return Possible.absent(); }

    default Possible<Integer> height() { return Possible.absent(); }

    default Possible<Integer> width() { return Possible.absent(); }
}
