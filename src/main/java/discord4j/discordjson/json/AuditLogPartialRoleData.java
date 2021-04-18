package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditLogPartialRoleData.class)
@JsonDeserialize(as = ImmutableAuditLogPartialRoleData.class)
public interface AuditLogPartialRoleData {

    static ImmutableAuditLogPartialRoleData.Builder builder() {
        return ImmutableAuditLogPartialRoleData.builder();
    }

    String id();

    String name();
}
