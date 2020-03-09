package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.OptionalInt;

@Value.Immutable
@JsonSerialize(as = ImmutableAttachmentData.class)
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
