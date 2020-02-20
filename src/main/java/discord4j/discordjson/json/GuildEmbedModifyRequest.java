package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmbedModifyRequest.class)
public interface GuildEmbedModifyRequest {

    default Possible<Boolean> enabled() { return Possible.absent(); }
    @JsonProperty("channel_id")
    default Possible<Optional<String>> channelId() { return Possible.absent(); }
}
