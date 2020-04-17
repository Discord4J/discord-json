package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteData.class)
@JsonDeserialize(as = ImmutableInviteData.class)
public interface InviteData {

    String code();
    Possible<PartialGuildData> guild();
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
