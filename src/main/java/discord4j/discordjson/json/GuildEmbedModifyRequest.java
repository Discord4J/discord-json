package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

/**
 * @deprecated Use {@link GuildWidgetModifyRequest} instead.
 */
@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmbedModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildEmbedModifyRequest.class)
@Deprecated
public interface GuildEmbedModifyRequest {

    static ImmutableGuildEmbedModifyRequest.Builder builder() {
        return ImmutableGuildEmbedModifyRequest.builder();
    }

    Possible<Boolean> enabled();
    @JsonProperty("channel_id")
    Possible<Optional<Id>> channelId();
}
