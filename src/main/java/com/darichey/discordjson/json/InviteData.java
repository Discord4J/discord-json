package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInviteData.class)
public interface InviteData {

    String code();
    Possible<GuildData> guild();
    ChannelData channel();
    @JsonProperty("target_user")
    Possible<UserData> targetUser();
    @JsonProperty("target_user_type")
    Possible<Integer> targetUserType();
    @JsonProperty("approximate_presence_count")
    Possible<Integer> approximatePresenceCount();
    @JsonProperty("approximate_member_count")
    Possible<Integer> approximateMemberCount();
    Possible<UserData> inviter();
    Possible<Integer> uses();
    @JsonProperty("max_uses")
    Possible<Integer> maxUses();
    @JsonProperty("max_age")
    Possible<Integer> maxAge();
    Possible<Boolean> temporary();
    @JsonProperty("created_at")
    Possible<String> createdAt();
}
