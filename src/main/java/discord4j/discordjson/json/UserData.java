package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
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

    Id id();

    @JsonProperty("global_name")
    Possible<String> globalName();

    String username();

    /**
     * @deprecated For removal
     * @return "0" if the user is using the new username system, otherwise the discriminator
     */
    @Deprecated
    String discriminator();

    Optional<String> avatar();

    Possible<Optional<String>> banner();

    @JsonProperty("accent_color")
    Possible<Optional<Integer>> accentColor();

    Possible<Boolean> bot();

    Possible<Boolean> system();

    @JsonProperty("mfa_enabled")
    Possible<Boolean> mfaEnabled();

    Possible<String> locale();

    Possible<Boolean> verified();

    Possible<Optional<String>> email();

    Possible<Long> flags();

    @JsonProperty("premium_type")
    Possible<Integer> premiumType();

    @JsonProperty("public_flags")
    Possible<Long> publicFlags();
}
