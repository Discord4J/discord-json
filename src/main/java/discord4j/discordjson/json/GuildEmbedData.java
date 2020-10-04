package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Optional;

/**
 * @deprecated Use {@link GuildWidgetData} instead.
 */
@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmbedData.class)
@JsonDeserialize(as = ImmutableGuildEmbedData.class)
@Deprecated
public interface GuildEmbedData {

    static ImmutableGuildEmbedData.Builder builder() {
        return ImmutableGuildEmbedData.builder();
    }

    boolean enabled();
    @JsonProperty("channel_id")
    Optional<Id> channelId();
}
