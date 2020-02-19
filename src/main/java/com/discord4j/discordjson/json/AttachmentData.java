package com.discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;
import java.util.OptionalInt;

@Value.Immutable
@JsonDeserialize(as = ImmutableAttachmentData.class)
public interface AttachmentData {

    String id();

    String filename();

    int size();

    String url();

    @JsonProperty("proxy_url")
    String proxyUrl();

    OptionalInt height();

    OptionalInt width();
}
