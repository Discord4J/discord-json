package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUnfurledMediaItemData.class)
@JsonDeserialize(as = ImmutableUnfurledMediaItemData.class)
public interface UnfurledMediaItemData {

    static ImmutableUnfurledMediaItemData.Builder builder() {
        return ImmutableUnfurledMediaItemData.builder();
    }

    String url();

    @JsonProperty("proxy_url")
    Possible<String> proxyUrl();

    Possible<Optional<Integer>> width();

    Possible<Optional<Integer>> height();

    Possible<Optional<String>> placeholder();

    @JsonProperty("placeholder_version")
    Possible<Optional<Integer>> placeholderVersion();

    @JsonProperty("content_type")
    Possible<Optional<String>> contentType();

    @JsonProperty("loading_state")
    Possible<Optional<Integer>> loadingState();

    Possible<Integer> flags();

}
