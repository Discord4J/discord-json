package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageDelete.class)
@JsonDeserialize(as = ImmutableMessageDelete.class)
public interface MessageDelete extends Dispatch {

    static ImmutableMessageDelete.Builder builder() {
        return ImmutableMessageDelete.builder();
    }

    String id();

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    Possible<String> guildId();
}
