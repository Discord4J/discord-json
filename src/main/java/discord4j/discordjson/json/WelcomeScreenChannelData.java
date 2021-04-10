package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWelcomeScreenChannelData.class)
@JsonDeserialize(as = ImmutableWelcomeScreenChannelData.class)
public interface WelcomeScreenChannelData {

    static ImmutableWelcomeScreenChannelData.Builder builder() {
        return ImmutableWelcomeScreenChannelData.builder();
    }

    @JsonProperty("channel_id")
    String channelId();

    String description();

    @JsonProperty("emoji_id")
    Optional<String> emojiId();

    @JsonProperty("emoji_name")
    Optional<String> emojiName();

}
