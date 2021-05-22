package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableFollowupMessageRequest.class)
@JsonDeserialize(as = ImmutableFollowupMessageRequest.class)
public interface FollowupMessageRequest extends WebhookExecuteRequest {

    static ImmutableFollowupMessageRequest.Builder builder() {
        return ImmutableFollowupMessageRequest.builder();
    }

    Possible<Integer> flags();
}
