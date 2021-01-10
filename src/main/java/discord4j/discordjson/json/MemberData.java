package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableMemberData.class)
@JsonDeserialize(as = ImmutableMemberData.class)
public interface MemberData {

    static ImmutableMemberData.Builder builder() {
        return ImmutableMemberData.builder();
    }

    UserData user();

    Possible<Optional<String>> nick();

    List<String> roles();

    @JsonProperty("joined_at")
    String joinedAt();

    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    @JsonProperty("hoisted_role")
    Optional<String> hoistedRole();

    boolean deaf();

    boolean mute();

    Possible<Boolean> pending();

    /** total permissions of the member in the channel, including overrides, returned when in the interaction object. */
    Possible<String> permissions();

}
