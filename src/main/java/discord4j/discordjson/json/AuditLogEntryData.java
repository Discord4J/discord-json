package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditLogEntryData.class)
@JsonDeserialize(as = ImmutableAuditLogEntryData.class)
public interface AuditLogEntryData {

    static ImmutableAuditLogEntryData.Builder builder() {
        return ImmutableAuditLogEntryData.builder();
    }

    @JsonProperty("target_id")
    Optional<String> targetId();

    Possible<List<AuditLogChangeData>> changes();

    @JsonProperty("user_id")
    String userId();

    String id();

    @JsonProperty("action_type")
    int actionType();

    Possible<AuditEntryInfoData> options();

    Possible<String> reason();
}
