package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelMentionData.class)
@JsonDeserialize(as = ImmutableChannelMentionData.class)
public interface ChannelMentionData {

    static ImmutableChannelMentionData.Builder builder() {
        return ImmutableChannelMentionData.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    int type();

    String name();
}
