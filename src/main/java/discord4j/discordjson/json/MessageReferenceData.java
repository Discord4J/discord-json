package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageReferenceData.class)
@JsonDeserialize(as = ImmutableMessageReferenceData.class)
public interface MessageReferenceData {

    static ImmutableMessageReferenceData.Builder builder() {
        return ImmutableMessageReferenceData.builder();
    }

    default int type() {
        return 0;
    }

    @JsonProperty("message_id")
    Possible<Id> messageId();

    @JsonProperty("channel_id")
    Possible<Id> channelId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("fail_if_not_exists")
    Possible<Boolean> failIfNotExists();
}
