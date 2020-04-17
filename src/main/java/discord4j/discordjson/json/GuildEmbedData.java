package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmbedData.class)
@JsonDeserialize(as = ImmutableGuildEmbedData.class)
public interface GuildEmbedData {

    static ImmutableGuildEmbedData.Builder builder() {
        return ImmutableGuildEmbedData.builder();
    }

    boolean enabled();
    @JsonProperty("channel_id")
    Optional<String> channelId();
}
