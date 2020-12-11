package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageDeleteBulk.class)
@JsonDeserialize(as = ImmutableMessageDeleteBulk.class)
public interface MessageDeleteBulk extends Dispatch {

    static ImmutableMessageDeleteBulk.Builder builder() {
        return ImmutableMessageDeleteBulk.builder();
    }

    List<Id> ids();
    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("guild_id")
    Possible<Id> guildId();
}
