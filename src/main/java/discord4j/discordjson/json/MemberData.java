package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMemberData.class)
@JsonDeserialize(as = ImmutableMemberData.class)
public interface MemberData extends PartialMemberData {

    static ImmutableMemberData.Builder builder() {
        return ImmutableMemberData.builder();
    }

    UserData user();

    Possible<Boolean> pending();

    /** total permissions of the member in the channel, including overrides, returned when in the interaction object. */
    Possible<String> permissions();
}
