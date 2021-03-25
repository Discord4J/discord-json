package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTypingStart.class)
@JsonDeserialize(as = ImmutableTypingStart.class)
public interface TypingStart extends Dispatch {

    static ImmutableTypingStart.Builder builder() {
        return ImmutableTypingStart.builder();
    }

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("user_id")
    Id userId();

    long timestamp();

    Possible<MemberData> member();
}
