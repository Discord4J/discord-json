package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;
import java.util.OptionalInt;

@Value.Immutable
@JsonSerialize(as = ImmutableAttachmentData.class)
@JsonDeserialize(as = ImmutableAttachmentData.class)
public interface AttachmentData {

    static ImmutableAttachmentData.Builder builder() {
        return ImmutableAttachmentData.builder();
    }

    Id id();

    String filename();

    @JsonProperty("content_type")
    Optional<String> contentType();

    int size();

    String url();

    @JsonProperty("proxy_url")
    String proxyUrl();

    OptionalInt height();

    OptionalInt width();
}
