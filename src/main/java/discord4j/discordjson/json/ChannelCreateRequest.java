package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelCreateRequest.class)
public interface ChannelCreateRequest {

    String name();
    int type();
    String topic();
    int bitrate();
    @JsonProperty("user_limit")
    int userLimit();
    @JsonProperty("rate_limit_per_user")
    int rateLimitPerUser();
    int position();
    @JsonProperty("permission_overwrites")
    List<OverwriteData> permissionOverwrites();
    @JsonProperty("parent_id")
    String parentId();
    boolean nsfw();
}
