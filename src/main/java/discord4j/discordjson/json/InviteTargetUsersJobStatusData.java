package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableInviteTargetUsersJobStatusData.class)
@JsonDeserialize(as = ImmutableInviteTargetUsersJobStatusData.class)
public interface InviteTargetUsersJobStatusData {

    static ImmutableInviteTargetUsersJobStatusData.Builder builder() {
        return ImmutableInviteTargetUsersJobStatusData.builder();
    }

    int status();

    @JsonProperty("total_users")
    int totalUsers();

    @JsonProperty("processed_users")
    int processedUsers();

    @JsonProperty("created_at")
    String createdAt();

    @JsonProperty("completed_at")
    Optional<String> completedAt();

    @JsonProperty("error_message")
    Possible<Optional<String>> errorMessage();
}
