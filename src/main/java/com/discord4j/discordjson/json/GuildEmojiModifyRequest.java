package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmojiModifyRequest.class)
public interface GuildEmojiModifyRequest {

    Possible<String> name();
    Possible<List<String>> roles();
}
