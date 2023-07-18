package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReactionAdd.class)
@JsonDeserialize(as = ImmutableMessageReactionAdd.class)
public interface MessageReactionAdd extends Dispatch {

    static ImmutableMessageReactionAdd.Builder builder() {
        return ImmutableMessageReactionAdd.builder();
    }

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("message_id")
    Id messageId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    Possible<MemberData> member();

    EmojiData emoji();

    @JsonProperty("message_author_id")
    Id messageAuthorId();
}
