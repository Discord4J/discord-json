package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelMentionData.class)
@JsonDeserialize(as = ImmutableChannelMentionData.class)
public interface ChannelMentionData {

    static ImmutableChannelMentionData.Builder builder() {
        return ImmutableChannelMentionData.builder();
    }

    String id();

    @JsonProperty("guild_id")
    String guildId();

    int type();

    String name();
}
