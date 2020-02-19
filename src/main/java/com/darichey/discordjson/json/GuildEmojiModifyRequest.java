package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmojiModifyRequest.class)
public interface GuildEmojiModifyRequest {

    Possible<String> name();
    Possible<List<String>> roles();
}
