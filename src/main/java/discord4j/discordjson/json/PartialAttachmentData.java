package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialAttachmentData.class)
@JsonDeserialize(as = ImmutablePartialAttachmentData.class)
public interface PartialAttachmentData {

    static ImmutablePartialAttachmentData.Builder builder() {
        return ImmutablePartialAttachmentData.builder();
    }

    Id id();

    String filename();

    Possible<String> description();

    @JsonProperty("content_type")
    Possible<String> contentType();

}
