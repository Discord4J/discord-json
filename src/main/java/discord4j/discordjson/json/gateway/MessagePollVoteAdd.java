package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessagePollVoteAdd.class)
@JsonDeserialize(as = ImmutableMessagePollVoteAdd.class)
public interface MessagePollVoteAdd extends Dispatch {

    static ImmutableMessagePollVoteAdd.Builder builder() {
        return ImmutableMessagePollVoteAdd.builder();
    }

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("message_id")
    Id messageId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("answer_id")
    int answerId();
}
