package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmbedModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildEmbedModifyRequest.class)
public interface GuildEmbedModifyRequest {

    static ImmutableGuildEmbedModifyRequest.Builder builder() {
        return ImmutableGuildEmbedModifyRequest.builder();
    }

    Possible<? extends Boolean> enabled();
    @JsonProperty("channel_id")
    Possible<Optional<String>> channelId();
}
