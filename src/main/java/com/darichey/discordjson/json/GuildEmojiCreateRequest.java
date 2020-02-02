package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmojiCreateRequest.class)
public interface GuildEmojiCreateRequest {

    String name();
    String image();
    List<String> roles();
}
