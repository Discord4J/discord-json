package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmojiModifyRequest.class)
public interface GuildEmojiModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<List<String>> roles() { return Possible.absent(); }
}
