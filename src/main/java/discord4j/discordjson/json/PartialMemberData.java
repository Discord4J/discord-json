package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutablePartialMemberData.class)
public interface PartialMemberData {

    default Possible<String> nick() { return Possible.absent(); }

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
