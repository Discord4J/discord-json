package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityEmojiData.class)
public interface ActivityEmojiData {

    String name();

    Possible<String> id();

    Possible<Boolean> animated();
}
