package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedAuthorData.class)
public interface EmbedAuthorData {

    Possible<String> name();

    Possible<String> url();

    @JsonProperty("icon_url")
    Possible<String> iconUrl();

    @JsonProperty("proxy_icon_url")
    Possible<String> proxyIconUrl();
}
