package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuditLogChangeData.class)
public interface AuditLogChangeData {

    @JsonProperty("new_value")
    default Possible<Object> newValue() { return Possible.absent(); }

    @JsonProperty("old_value")
    default Possible<Object> oldValue() { return Possible.absent(); }

    String key();
}
