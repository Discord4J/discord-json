package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageApplicationData.class)
public interface MessageApplicationData {

    String id();

    @JsonProperty("cover_image")
    Possible<String> coverImage();

    String description();

    Optional<String> icon();

    String name();
}
