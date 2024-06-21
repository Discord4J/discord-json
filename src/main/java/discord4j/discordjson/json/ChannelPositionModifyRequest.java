package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelPositionModifyRequest.class)
@JsonDeserialize(as = ImmutableChannelPositionModifyRequest.class)
public interface ChannelPositionModifyRequest {

    static ImmutableChannelPositionModifyRequest.Builder builder() {
        return ImmutableChannelPositionModifyRequest.builder();
    }

    String id();

    Possible<Optional<Integer>> position();

    @JsonProperty("lock_permissions")
    Possible<Optional<Boolean>> lockPermissions();

    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();

}
