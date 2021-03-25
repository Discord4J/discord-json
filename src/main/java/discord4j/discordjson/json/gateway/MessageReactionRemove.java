package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReactionRemove.class)
@JsonDeserialize(as = ImmutableMessageReactionRemove.class)
public interface MessageReactionRemove extends Dispatch {

    static ImmutableMessageReactionRemove.Builder builder() {
        return ImmutableMessageReactionRemove.builder();
    }

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("message_id")
    Id messageId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    EmojiData emoji();
}
