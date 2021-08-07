package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageEditRequest.class)
@JsonDeserialize(as = ImmutableMessageEditRequest.class)
public interface MessageEditRequest extends MessageRequestBase {

    static ImmutableMessageEditRequest.Builder builder() {
        return ImmutableMessageEditRequest.builder();
    }

    Possible<Optional<Integer>> flags();

    Possible<Optional<List<AttachmentData>>> attachments();
}
