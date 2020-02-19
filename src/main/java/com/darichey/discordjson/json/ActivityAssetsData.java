package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityAssetsData.class)
public interface ActivityAssetsData {

    @JsonProperty("large_image")
    default Possible<String> largeImage() { return Possible.absent(); }

    @JsonProperty("large_text")
    default Possible<String> largeText() { return Possible.absent(); }

    @JsonProperty("small_image")
    default Possible<String> smallImage() { return Possible.absent(); }

    @JsonProperty("small_text")
    default Possible<String> smallText() { return Possible.absent(); }
}
