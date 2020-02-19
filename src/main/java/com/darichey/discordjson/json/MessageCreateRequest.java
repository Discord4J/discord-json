package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageCreateRequest.class)
public interface MessageCreateRequest {

    default Possible<String> content() { return Possible.absent(); }
    default Possible<Object> nonce() { return Possible.absent(); }
    default Possible<Boolean> tts() { return Possible.absent(); }
    default Possible<EmbedData> embed() { return Possible.absent(); }
}
