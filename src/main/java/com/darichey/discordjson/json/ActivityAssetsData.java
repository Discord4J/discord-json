package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityAssetsData.class)
public interface ActivityAssetsData {

    @JsonProperty("large_image")
    Possible<String> largeImage();

    @JsonProperty("large_text")
    Possible<String> largeText();

    @JsonProperty("small_image")
    Possible<String> smallImage();

    @JsonProperty("small_text")
    Possible<String> smallText();
}
