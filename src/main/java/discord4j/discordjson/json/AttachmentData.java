package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
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

    int size();

    String url();

    @JsonProperty("proxy_url")
    String proxyUrl();

    Possible<Optional<Integer>> height();

    Possible<Optional<Integer>> width();
}
