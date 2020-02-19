package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageEditRequest.class)
public interface MessageEditRequest {

    default Possible<Optional<String>> content() { return Possible.absent(); }
    default Possible<Optional<EmbedData>> embed() { return Possible.absent(); }
    default Possible<Integer> flags() { return Possible.absent(); }
}
