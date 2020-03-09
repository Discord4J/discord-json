package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReactionRemoveAll.class)
@JsonDeserialize(as = ImmutableMessageReactionRemoveAll.class)
public interface MessageReactionRemoveAll extends Dispatch {

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("message_id")
    String messageId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
}
