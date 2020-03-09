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
    default Possible<String> largeImage() { return Possible.absent(); }

    @JsonProperty("large_text")
    default Possible<String> largeText() { return Possible.absent(); }

    @JsonProperty("small_image")
    default Possible<String> smallImage() { return Possible.absent(); }

    @JsonProperty("small_text")
    default Possible<String> smallText() { return Possible.absent(); }
}
