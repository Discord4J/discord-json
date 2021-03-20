package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteDelete.class)
@JsonDeserialize(as = ImmutableInviteDelete.class)
public interface InviteDelete extends Dispatch {

    static ImmutableInviteDelete.Builder builder() {
        return ImmutableInviteDelete.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("channel_id")
    Id channelId();

    String code();
}
