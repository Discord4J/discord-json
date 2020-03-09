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

    @JsonProperty("new_value")
    default Possible<Object> newValue() { return Possible.absent(); }

    @JsonProperty("old_value")
    default Possible<Object> oldValue() { return Possible.absent(); }

    String key();
}
