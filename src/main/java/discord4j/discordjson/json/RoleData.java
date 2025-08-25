package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleData.class)
@JsonDeserialize(as = ImmutableRoleData.class)
public interface RoleData extends RoleDataFields {

    static ImmutableRoleData.Builder builder() {
        return ImmutableRoleData.builder();
    }

    int position();

    boolean managed();

    RoleColorData colors();
}
