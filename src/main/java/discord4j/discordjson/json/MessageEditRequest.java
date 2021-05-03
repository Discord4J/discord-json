package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageEditRequest.class)
@JsonDeserialize(as = ImmutableMessageEditRequest.class)
public interface MessageEditRequest {

    static ImmutableMessageEditRequest.Builder builder() {
        return ImmutableMessageEditRequest.builder();
    }

    Possible<Optional<String>> content();

    Possible<Optional<EmbedData>> embed();

    Possible<Optional<Integer>> flags();

    @JsonProperty("allowed_mentions")
    Possible<Optional<AllowedMentionsData>> allowedMentions();

    Possible<Optional<List<AttachmentData>>> attachments();
    
}
