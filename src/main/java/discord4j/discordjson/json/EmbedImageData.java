package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedImageData.class)
@JsonDeserialize(as = ImmutableEmbedImageData.class)
public interface EmbedImageData {

    static ImmutableEmbedImageData.Builder builder() {
        return ImmutableEmbedImageData.builder();
    }

    Possible<? extends String> url();

    @JsonProperty("proxy_url")
    Possible<? extends String> proxyUrl();

    Possible<? extends Integer> height();

    Possible<? extends Integer> width();
}
