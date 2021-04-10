package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWelcomeScreenData.class)
@JsonDeserialize(as = ImmutableWelcomeScreenData.class)
public interface WelcomeScreenData {

    static ImmutableWelcomeScreenData.Builder builder() {
        return ImmutableWelcomeScreenData.builder();
    }

    Optional<String> description();

    @JsonProperty("welcome_channels")
    List<WelcomeScreenChannelData> welcomeChannels();

}
