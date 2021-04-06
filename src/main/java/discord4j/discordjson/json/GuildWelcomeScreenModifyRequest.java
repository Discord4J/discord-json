package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildWelcomeScreenModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildWelcomeScreenModifyRequest.class)
public interface GuildWelcomeScreenModifyRequest {

    static ImmutableGuildWelcomeScreenModifyRequest.Builder builder() {
        return ImmutableGuildWelcomeScreenModifyRequest.builder();
    }

    Possible<Optional<Boolean>> enabled();

    @JsonProperty("welcome_channels")
    Possible<Optional<List<WelcomeScreenChannelData>>> welcomeChannels();

    Possible<Optional<String>> description();

}
