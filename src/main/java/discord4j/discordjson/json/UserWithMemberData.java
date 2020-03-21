package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserWithMemberData.class)
@JsonDeserialize(as = ImmutableUserWithMemberData.class)
public interface UserWithMemberData extends UserData {

    default Possible<PartialMemberData> member() { return Possible.absent(); }
}
