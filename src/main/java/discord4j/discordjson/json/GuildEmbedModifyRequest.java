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

    default Possible<Boolean> enabled() { return Possible.absent(); }
    @JsonProperty("channel_id")
    default Possible<Optional<String>> channelId() { return Possible.absent(); }
}
