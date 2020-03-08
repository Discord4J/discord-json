package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInviteData.class)
public interface InviteData {

    String code();
    default Possible<PartialGuildData> guild() { return Possible.absent(); }
    ChannelData channel();
    @JsonProperty("target_user")
    default Possible<UserData> targetUser() { return Possible.absent(); }
    @JsonProperty("target_user_type")
    default Possible<Integer> targetUserType() { return Possible.absent(); }
    @JsonProperty("approximate_presence_count")
    default Possible<Integer> approximatePresenceCount() { return Possible.absent(); }
    @JsonProperty("approximate_member_count")
    default Possible<Integer> approximateMemberCount() { return Possible.absent(); }
    default Possible<UserData> inviter() { return Possible.absent(); }
    default Possible<Integer> uses() { return Possible.absent(); }
    @JsonProperty("max_uses")
    default Possible<Integer> maxUses() { return Possible.absent(); }
    @JsonProperty("max_age")
    default Possible<Integer> maxAge() { return Possible.absent(); }
    default Possible<Boolean> temporary() { return Possible.absent(); }
    @JsonProperty("created_at")
    default Possible<String> createdAt() { return Possible.absent(); }
}
