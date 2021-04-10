package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.PartialUserData;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteCreate.class)
@JsonDeserialize(as = ImmutableInviteCreate.class)
public interface InviteCreate extends Dispatch {

    static ImmutableInviteCreate.Builder builder() {
        return ImmutableInviteCreate.builder();
    }

    @JsonProperty("channel_id")
    Id channelId();

    String code();

    @JsonProperty("created_at")
    String createdAt();

    @JsonProperty("guild_id")
    Id guildId();

    Possible<UserData> inviter();

    @JsonProperty("max_age")
    int maxAge();

    @JsonProperty("max_uses")
    int maxUses();

    @JsonProperty("target_type")
    Possible<Integer> targetType();

    @JsonProperty("target_user")
    Possible<UserData> targetUser();

    /* TODO
     * @JsonProperty("target_application")
     * Possible<?> targetApplication();
     */

    boolean temporary();

    int uses();

}
