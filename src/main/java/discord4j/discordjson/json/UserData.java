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

    static ImmutableUserData.Builder builder() {
        return ImmutableUserData.builder();
    }

    String id();

    String username();

    String discriminator();

    Optional<String> avatar();

    Possible<? extends Boolean> bot();

    Possible<? extends Boolean> system();

    @JsonProperty("mfa_enabled")
    Possible<? extends Boolean> mfaEnabled();

    Possible<? extends String> locale();

    Possible<? extends Boolean> verified();

    Possible<Optional<String>> email();

    Possible<? extends Integer> flags();

    @JsonProperty("premium_type")
    Possible<? extends Integer> premiumType();

    @JsonProperty("public_flags")
    Possible<? extends Integer> publicFlags();
}
