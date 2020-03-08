package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUserWithMemberData.class)
public interface UserWithMemberData extends UserData {

    MemberData member();
}
