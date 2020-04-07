package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageEditRequest.class)
@JsonDeserialize(as = ImmutableMessageEditRequest.class)
public interface MessageEditRequest {

    default Possible<Optional<String>> content() { return Possible.absent(); }
    default Possible<Optional<EmbedData>> embed() { return Possible.absent(); }
    @JsonProperty("allowed_mentions ")
    default Possible<Optional<AllowedMentionsData>> allowedMentions() { return Possible.absent(); }
    default Possible<Integer> flags() { return Possible.absent(); }
}
