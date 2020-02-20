package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuditEntryInfoData.class)
public interface AuditEntryInfoData {

    @JsonProperty("delete_member_days")
    default Possible<String> deleteMemberDays() { return Possible.absent(); }

    @JsonProperty("members_removed")
    default Possible<String> membersRemoved() { return Possible.absent(); }

    @JsonProperty("channel_id")
    default Possible<String> channelId() { return Possible.absent(); }

    @JsonProperty("message_id")
    default Possible<String> messageId() { return Possible.absent(); }

    default Possible<String> count() { return Possible.absent(); }

    default Possible<String> id() { return Possible.absent(); }

    default Possible<String> type() { return Possible.absent(); }

    @JsonProperty("role_name")
    default Possible<String> roleName() { return Possible.absent(); }
}
