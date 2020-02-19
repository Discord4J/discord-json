package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableEmojiData.class)
public interface EmojiData {

    Optional<String> id();

    Optional<String> name();

    Possible<List<String>> roles();

    Possible<UserData> user();

    @JsonProperty("require_colons")
    Possible<Boolean> requireColons();

    Possible<Boolean> managed();

    Possible<Boolean> animated();
}
