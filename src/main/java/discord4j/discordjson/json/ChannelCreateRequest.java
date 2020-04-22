package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelCreateRequest.class)
@JsonDeserialize(as = ImmutableChannelCreateRequest.class)
public interface ChannelCreateRequest {

    static ImmutableChannelCreateRequest.Builder builder() {
        return ImmutableChannelCreateRequest.builder();
    }

    String name();
    Possible<? extends Integer> type();
    Possible<? extends String> topic();
    Possible<? extends Integer> bitrate();
    @JsonProperty("user_limit")
    Possible<? extends Integer> userLimit();
    @JsonProperty("rate_limit_per_user")
    Possible<? extends Integer> rateLimitPerUser();
    Possible<? extends Integer> position();
    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();
    @JsonProperty("parent_id")
    Possible<? extends String> parentId();
    Possible<? extends Boolean> nsfw();
}
