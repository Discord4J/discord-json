package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelModifyRequest.class)
@JsonDeserialize(as = ImmutableChannelModifyRequest.class)
public interface ChannelModifyRequest {

    static ImmutableChannelModifyRequest.Builder builder() {
        return ImmutableChannelModifyRequest.builder();
    }

    Possible<? extends String> name();
    Possible<? extends Integer> position();
    Possible<? extends String> topic();
    Possible<? extends Boolean> nsfw();
    @JsonProperty("rate_limit_per_user")
    Possible<? extends Integer> rateLimitPerUser();
    Possible<? extends Integer> bitrate();
    @JsonProperty("user_limit")
    Possible<? extends Integer> userLimit();
    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();
    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();
}
