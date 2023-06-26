package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedAuthorData.class)
@JsonDeserialize(as = ImmutableEmbedAuthorData.class)
public interface EmbedAuthorData {

    static ImmutableEmbedAuthorData.Builder builder() {
        return ImmutableEmbedAuthorData.builder();
    }

    Possible<String> name();

    Possible<Optional<String>> url();

    @JsonProperty("icon_url")
    Possible<String> iconUrl();

    @JsonProperty("proxy_icon_url")
    Possible<String> proxyIconUrl();
}
