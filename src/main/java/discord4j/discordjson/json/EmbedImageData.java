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

    Possible<String> url();

    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    Possible<Integer> height();

    Possible<Integer> width();
}
