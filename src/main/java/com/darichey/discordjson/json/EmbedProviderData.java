package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmbedProviderData.class)
public interface EmbedProviderData {

    default Possible<String> name() { return Possible.absent(); }

    default Possible<String> url() { return Possible.absent(); }
}
