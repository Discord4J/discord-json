package com.discord4j.discordjson.json.gateway;

import com.discord4j.discordjson.json.MessageData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageCreate.class)
public interface MessageCreate extends Dispatch {

    @JsonUnwrapped
    MessageData message();
}
