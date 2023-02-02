package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
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

    Optional<String> avatar();

    List<Id> roles();

    // Nullable for member update event concerning lurker in stage channel
    @JsonProperty("joined_at")
    Optional<String> joinedAt();

    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    @JsonProperty("hoisted_role")
    Optional<String> hoistedRole();

    boolean deaf();

    boolean mute();

    @JsonProperty("communication_disabled_until")
    Possible<Optional<String>> communicationDisabledUntil();

    default long flags() {
        return 0L;
    }
}
