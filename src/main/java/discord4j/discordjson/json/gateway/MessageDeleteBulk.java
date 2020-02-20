package discord4j.discordjson.json.gateway;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageDeleteBulk.class)
public interface MessageDeleteBulk extends Dispatch {

    List<String> ids();
    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
}
