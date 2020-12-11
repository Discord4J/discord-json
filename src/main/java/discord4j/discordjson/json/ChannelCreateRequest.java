package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
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
    Possible<Integer> type();
    Possible<String> topic();
    Possible<Integer> bitrate();
    @JsonProperty("user_limit")
    Possible<Integer> userLimit();
    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();
    Possible<Integer> position();
    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();
    @JsonProperty("parent_id")
    Possible<Id> parentId();
    Possible<Boolean> nsfw();
}
