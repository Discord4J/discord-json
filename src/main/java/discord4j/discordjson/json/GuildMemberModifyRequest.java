package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberModifyRequest.class)
public interface GuildMemberModifyRequest {

    default Possible<String> nick() { return Possible.absent(); }
    default Possible<List<String>> roles() { return Possible.absent(); }
    default Possible<Boolean> mute() { return Possible.absent(); }
    default Possible<Boolean> deaf() { return Possible.absent(); }
    @JsonProperty("channel_id")
    Optional<String> channelId();
}
