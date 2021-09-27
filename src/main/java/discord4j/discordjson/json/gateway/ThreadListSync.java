package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.json.ThreadMemberData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadListSync.class)
@JsonDeserialize(as = ImmutableThreadListSync.class)
public interface ThreadListSync extends Dispatch {

    static ImmutableThreadListSync.Builder builder() {
        return ImmutableThreadListSync.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("channel_ids")
    Possible<List<Id>> channelIds();

    List<ChannelData> threads();

    List<ThreadMemberData> members();
}