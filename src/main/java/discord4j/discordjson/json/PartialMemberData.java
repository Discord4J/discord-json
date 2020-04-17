package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialMemberData.class)
@JsonDeserialize(as = ImmutablePartialMemberData.class)
public interface PartialMemberData {

    static ImmutablePartialMemberData.Builder builder() {
        return ImmutablePartialMemberData.builder();
    }

    Possible<Optional<String>> nick();

    List<String> roles();

    @JsonProperty("joined_at")
    String joinedAt();

    @JsonProperty("premium_since")
    Optional<String> premiumSince();

    @JsonProperty("hoisted_role")
    Optional<String> hoistedRole();

    boolean deaf();

    boolean mute();
}
