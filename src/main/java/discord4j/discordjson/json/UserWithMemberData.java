package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserWithMemberData.class)
@JsonDeserialize(as = ImmutableUserWithMemberData.class)
public interface UserWithMemberData extends UserData {

    MemberData member();
}
