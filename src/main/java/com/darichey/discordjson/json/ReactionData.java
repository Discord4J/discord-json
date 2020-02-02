package com.darichey.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableReactionData.class)
public interface ReactionData {

    int count();

    boolean me();

    EmojiData emoji();
}
