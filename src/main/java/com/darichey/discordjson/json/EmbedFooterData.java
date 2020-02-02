package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedFooterData.class)
public interface EmbedFooterData {

    String text();

    @JsonProperty("icon_url")
    Possible<String> iconUrl();

    @JsonProperty("proxy_icon_url")
    Possible<String> proxyIconUrl();
}
