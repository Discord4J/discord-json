package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookModifyWithTokenRequest.class)
@JsonDeserialize(as = ImmutableWebhookModifyWithTokenRequest.class)
public interface WebhookModifyWithTokenRequest {

    static ImmutableWebhookModifyWithTokenRequest.Builder builder() {
        return ImmutableWebhookModifyWithTokenRequest.builder();
    }

    Possible<String> name();
    Possible<String> avatar();
}
