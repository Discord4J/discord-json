package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageCreateRequest.class)
public interface MessageCreateRequest {

    Possible<String> content();
    Possible<Object> nonce();
    Possible<Boolean> tts();
    Possible<EmbedData> embed();
}
