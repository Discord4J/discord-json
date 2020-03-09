package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedThumbnailData.class)
@JsonDeserialize(as = ImmutableEmbedThumbnailData.class)
public interface EmbedThumbnailData {

    default Possible<String> url() { return Possible.absent(); }

    @JsonProperty("proxy_url")
    default Possible<String> proxyUrl() { return Possible.absent(); }

    default Possible<Integer> height() { return Possible.absent(); }

    default Possible<Integer> width() { return Possible.absent(); }
}
