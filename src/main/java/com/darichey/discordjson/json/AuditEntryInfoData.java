package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableAuditEntryInfoData.class)
public interface AuditEntryInfoData {

    @JsonProperty("delete_member_days")
    Possible<String> deleteMemberDays();

    @JsonProperty("members_removed")
    Possible<String> membersRemoved();

    @JsonProperty("channel_id")
    Possible<String> channelId();

    @JsonProperty("message_id")
    Possible<String> messageId();

    Possible<String> count();

    Possible<String> id();

    Possible<String> type();

    @JsonProperty("role_name")
    Possible<String> roleName();
}
