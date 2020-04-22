package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialUserData.class)
@JsonDeserialize(as = ImmutablePartialUserData.class)
public interface PartialUserData {

    static ImmutablePartialUserData.Builder builder() {
        return ImmutablePartialUserData.builder();
    }

    String id();

    Possible<? extends String> username();

    Possible<? extends String> discriminator();

    Possible<Optional<String>> avatar();

    Possible<? extends Boolean> bot();

    Possible<? extends Boolean> system();

    @JsonProperty("mfa_enabled")
    Possible<? extends Boolean> mfaEnabled();

    Possible<? extends String> locale();

    Possible<? extends Boolean> verified();

    Possible<? extends String> email();

    Possible<? extends Integer> flags();

    @JsonProperty("premium_type")
    Possible<? extends Integer> premiumType();

    @JsonProperty("public_flags")
    Possible<? extends Integer> publicFlags();
}
