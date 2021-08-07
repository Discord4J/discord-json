package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

// note that all fields are Optional for compatibility with edit requests.
// this breaks from Discord's documentation for these types but makes for a cleaner implementation
@Value.Immutable
@JsonSerialize(as = ImmutableMessageRequestBase.class)
@JsonDeserialize(as = ImmutableMessageRequestBase.class)
public interface MessageRequestBase {

    static ImmutableMessageRequestBase.Builder builder() {
        return ImmutableMessageRequestBase.builder();
    }

    Possible<Optional<String>> content();

    Possible<Optional<Boolean>> tts();

    @JsonProperty("allowed_mentions")
    Possible<Optional<AllowedMentionsData>> allowedMentions();

    Possible<Optional<List<ComponentData>>> components();

    Possible<Optional<List<EmbedData>>> embeds();
}
