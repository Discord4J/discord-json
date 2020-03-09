package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReferenceData.class)
@JsonDeserialize(as = ImmutableMessageReferenceData.class)
public interface MessageReferenceData {

    @JsonProperty("message_id")
    default Possible<String> messageId() { return Possible.absent(); }

    @JsonProperty("channel_id")
    default Possible<String> channelId() { return Possible.absent(); }

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }
}
