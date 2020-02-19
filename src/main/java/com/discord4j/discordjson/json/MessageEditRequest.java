package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageEditRequest.class)
public interface MessageEditRequest {

    Possible<Optional<String>> content();
    Possible<Optional<EmbedData>> embed();
    Possible<Integer> flags();
}
