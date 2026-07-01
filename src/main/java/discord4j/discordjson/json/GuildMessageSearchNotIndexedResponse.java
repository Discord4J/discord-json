package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMessageSearchNotIndexedResponse.class)
@JsonDeserialize(as = ImmutableGuildMessageSearchNotIndexedResponse.class)
public interface GuildMessageSearchNotIndexedResponse {

    String message();
    int code();

    @JsonProperty("documents_indexed")
    int documentsIndexed();

    @JsonProperty("retry_after")
    long retryAfter();

}
