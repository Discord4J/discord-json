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

    String text();

    @JsonProperty("icon_url")
    default Possible<String> iconUrl() { return Possible.absent(); }

    @JsonProperty("proxy_icon_url")
    default Possible<String> proxyIconUrl() { return Possible.absent(); }
}
