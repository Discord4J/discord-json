package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteData.class)
@JsonDeserialize(as = ImmutableInviteData.class)
public interface InviteData {

    static ImmutableInviteData.Builder builder() {
        return ImmutableInviteData.builder();
    }

    String code();

    Possible<PartialGuildData> guild();

    ChannelData channel();

    Possible<UserData> inviter();

    @JsonProperty("target_type")
    Possible<Integer> targetType();

    @JsonProperty("target_user")
    Possible<UserData> targetUser();

    /* TODO
     * @JsonProperty("target_application")
     * Possible<?> targetApplication();
     */

    @JsonProperty("approximate_presence_count")
    Possible<Integer> approximatePresenceCount();

    @JsonProperty("approximate_member_count")
    Possible<Integer> approximateMemberCount();

    @JsonProperty("expires_at")
    Possible<Optional<String>> expiresAt();

    Possible<Integer> uses();

    @JsonProperty("max_uses")
    Possible<Integer> maxUses();

    @JsonProperty("max_age")
    Possible<Integer> maxAge();

    Possible<Boolean> temporary();

    @JsonProperty("created_at")
    Possible<String> createdAt();

}
