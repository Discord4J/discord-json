package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageCreateRequest.class)
@JsonDeserialize(as = ImmutableMessageCreateRequest.class)
public interface MessageCreateRequest {

    default Possible<String> content() { return Possible.absent(); }
    default Possible<Object> nonce() { return Possible.absent(); }
    default Possible<Boolean> tts() { return Possible.absent(); }
    default Possible<EmbedData> embed() { return Possible.absent(); }
    @JsonProperty("allowed_mentions")
    default Possible<AllowedMentionsData> allowedMentions() { return Possible.absent(); }
}
