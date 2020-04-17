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

    Possible<String> content();
    Possible<Object> nonce();
    Possible<Boolean> tts();
    Possible<EmbedData> embed();
    @JsonProperty("allowed_mentions")
    Possible<AllowedMentionsData> allowedMentions();
}
