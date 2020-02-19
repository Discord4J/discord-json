package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedAuthorData.class)
public interface EmbedAuthorData {

    default Possible<String> name() { return Possible.absent(); }

    default Possible<String> url() { return Possible.absent(); }

    @JsonProperty("icon_url")
    default Possible<String> iconUrl() { return Possible.absent(); }

    @JsonProperty("proxy_icon_url")
    default Possible<String> proxyIconUrl() { return Possible.absent(); }
}
