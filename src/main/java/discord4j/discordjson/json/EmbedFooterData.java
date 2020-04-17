package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEmbedFooterData.class)
@JsonDeserialize(as = ImmutableEmbedFooterData.class)
public interface EmbedFooterData {

    static ImmutableEmbedFooterData.Builder builder() {
        return ImmutableEmbedFooterData.builder();
    }

    String text();

    @JsonProperty("icon_url")
    Possible<String> iconUrl();

    @JsonProperty("proxy_icon_url")
    Possible<String> proxyIconUrl();
}
