package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAuditEntryInfoData.class)
@JsonDeserialize(as = ImmutableAuditEntryInfoData.class)
public interface AuditEntryInfoData {

    static ImmutableAuditEntryInfoData.Builder builder() {
        return ImmutableAuditEntryInfoData.builder();
    }

    @JsonProperty("delete_member_days")
    Possible<? extends String> deleteMemberDays();

    @JsonProperty("members_removed")
    Possible<? extends String> membersRemoved();

    @JsonProperty("channel_id")
    Possible<? extends String> channelId();

    @JsonProperty("message_id")
    Possible<? extends String> messageId();

    Possible<? extends String> count();

    Possible<? extends String> id();

    Possible<? extends String> type();

    @JsonProperty("role_name")
    Possible<? extends String> roleName();
}
