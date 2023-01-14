package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.AuditLogEntryData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditLogEntryCreate.class)
@JsonDeserialize(as = ImmutableAuditLogEntryCreate.class)
public interface AuditLogEntryCreate extends Dispatch, AuditLogEntryData {

    static ImmutableAuditLogEntryCreate.Builder builder() {
        return ImmutableAuditLogEntryCreate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

}
