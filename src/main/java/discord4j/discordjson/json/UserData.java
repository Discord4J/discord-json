package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableUserData.class)
@JsonDeserialize(as = ImmutableUserData.class)
public interface UserData {

    String id();

    String username();

    String discriminator();

    Optional<String> avatar();

    default Possible<Boolean> bot() { return Possible.absent(); }

    default Possible<Boolean> system() { return Possible.absent(); }

    @JsonProperty("mfa_enabled")
    default Possible<Boolean> mfaEnabled() { return Possible.absent(); }

    default Possible<String> locale() { return Possible.absent(); }

    default Possible<Boolean> verified() { return Possible.absent(); }

    // TODO Ready can contain null email field!
    default Possible<Optional<String>> email() { return Possible.absent(); }

    default Possible<Integer> flags() { return Possible.absent(); }

    @JsonProperty("premium_type")
    default Possible<Integer> premiumType() { return Possible.absent(); }
}
