package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookCreateRequest.class)
@JsonDeserialize(as = ImmutableWebhookCreateRequest.class)
public interface WebhookCreateRequest {

    String name();
    Optional<String> avatar();
}
