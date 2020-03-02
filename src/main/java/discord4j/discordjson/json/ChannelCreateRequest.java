package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelCreateRequest.class)
public interface ChannelCreateRequest {

    String name();
    default Possible<Integer> type() { return Possible.absent(); }
    default Possible<String> topic() { return Possible.absent(); }
    default Possible<Integer> bitrate() { return Possible.absent(); }
    @JsonProperty("user_limit")
    default Possible<Integer> userLimit() { return Possible.absent(); }
    @JsonProperty("rate_limit_per_user")
    default Possible<Integer> rateLimitPerUser() { return Possible.absent(); }
    default Possible<Integer> position() { return Possible.absent(); }
    @JsonProperty("permission_overwrites")
    default Possible<List<OverwriteData>> permissionOverwrites() { return Possible.absent(); }
    @JsonProperty("parent_id")
    default Possible<String> parentId() { return Possible.absent(); }
    default Possible<Boolean> nsfw() { return Possible.absent(); }
}
