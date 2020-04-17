package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityAssetsData.class)
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
