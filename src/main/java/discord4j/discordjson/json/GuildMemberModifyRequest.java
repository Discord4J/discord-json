package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildMemberModifyRequest.class)
public interface GuildMemberModifyRequest {

    static ImmutableGuildMemberModifyRequest.Builder builder() {
        return ImmutableGuildMemberModifyRequest.builder();
    }

    Possible<Optional<String>> nick();
    Possible<List<String>> roles();
    Possible<Boolean> mute();
    Possible<Boolean> deaf();
    @JsonProperty("channel_id")
    Possible<Optional<String>> channelId();
}
