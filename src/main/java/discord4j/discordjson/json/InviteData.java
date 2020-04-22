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

    static ImmutableInviteData.Builder builder() {
        return ImmutableInviteData.builder();
    }

    String code();
    Possible<? extends PartialGuildData> guild();
    ChannelData channel();
    @JsonProperty("target_user")
    Possible<? extends UserData> targetUser();
    @JsonProperty("target_user_type")
    Possible<? extends Integer> targetUserType();
    @JsonProperty("approximate_presence_count")
    Possible<? extends Integer> approximatePresenceCount();
    @JsonProperty("approximate_member_count")
    Possible<? extends Integer> approximateMemberCount();
    Possible<? extends UserData> inviter();
    Possible<? extends Integer> uses();
    @JsonProperty("max_uses")
    Possible<? extends Integer> maxUses();
    @JsonProperty("max_age")
    Possible<? extends Integer> maxAge();
    Possible<? extends Boolean> temporary();
    @JsonProperty("created_at")
    Possible<? extends String> createdAt();
}
