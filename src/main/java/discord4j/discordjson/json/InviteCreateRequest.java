package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteCreateRequest.class)
@JsonDeserialize(as = ImmutableInviteCreateRequest.class)
public interface InviteCreateRequest {

    static ImmutableInviteCreateRequest.Builder builder() {
        return ImmutableInviteCreateRequest.builder();
    }

    @JsonProperty("max_age")
    Possible<Integer> maxAge();

    @JsonProperty("max_uses")
    Possible<Integer> maxUses();

    Possible<Boolean> temporary();

    Possible<Boolean> unique();

    @JsonProperty("target_type")
    Possible<Integer> targetType();

    @JsonProperty("target_user_id")
    Possible<String> targetUserId();

    @JsonProperty("target_application_id")
    Possible<String> targetApplicationId();

}
