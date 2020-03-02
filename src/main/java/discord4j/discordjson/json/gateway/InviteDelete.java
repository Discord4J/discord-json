package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.UserData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableInviteDelete.class)
public interface InviteDelete extends Dispatch {

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("channel_id")
    String channelId();

    String code();
}
