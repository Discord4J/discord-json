package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditLogData.class)
@JsonDeserialize(as = ImmutableAuditLogData.class)
public interface AuditLogData {

    static ImmutableAuditLogData.Builder builder() {
        return ImmutableAuditLogData.builder();
    }

    List<WebhookData> webhooks();

    List<UserData> users();

    @JsonProperty("audit_log_entries")
    List<AuditLogEntryData> auditLogEntries();

    List<IntegrationData> integrations();

    @JsonProperty("auto_moderation_rules")
    List<AutoModRuleData> autoModerationRules();
}
