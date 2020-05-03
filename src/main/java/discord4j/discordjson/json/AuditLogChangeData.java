package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditLogChangeData.class)
@JsonDeserialize(as = ImmutableAuditLogChangeData.class)
public interface AuditLogChangeData {

    static ImmutableAuditLogChangeData.Builder builder() {
        return ImmutableAuditLogChangeData.builder();
    }

    @JsonProperty("new_value")
    Possible<Object> newValue();

    @JsonProperty("old_value")
    Possible<Object> oldValue();

    String key();
}
