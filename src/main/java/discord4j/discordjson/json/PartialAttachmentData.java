package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialAttachmentData.class)
@JsonDeserialize(as = ImmutablePartialAttachmentData.class)
public interface PartialAttachmentData {

    static ImmutablePartialAttachmentData.Builder builder() {
        return ImmutablePartialAttachmentData.builder();
    }

    String filename();

    String description();

    @JsonProperty("content_type")
    Possible<String> contentType();

    int size();

    String url();

    @JsonProperty("proxy_url")
    String proxyUrl();

    Possible<Optional<Integer>> height();

    Possible<Optional<Integer>> width();

    Possible<Boolean> ephemeral();

}
