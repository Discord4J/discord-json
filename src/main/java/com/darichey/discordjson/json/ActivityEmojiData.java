package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityEmojiData.class)
public interface ActivityEmojiData {

    String name();

    default Possible<String> id() { return Possible.absent(); }

    default Possible<Boolean> animated() { return Possible.absent(); }
}
