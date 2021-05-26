package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookCreateRequest.class)
@JsonDeserialize(as = ImmutableWebhookCreateRequest.class)
public interface WebhookCreateRequest {

    static ImmutableWebhookCreateRequest.Builder builder() {
        return ImmutableWebhookCreateRequest.builder();
    }

    String name();

    Possible<Optional<String>> avatar();
}
