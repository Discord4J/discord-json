package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookPartialGuildData.class)
@JsonDeserialize(as = ImmutableWebhookPartialGuildData.class)
public interface WebhookPartialGuildData {

    static ImmutableWebhookPartialGuildData.Builder builder() {
        return ImmutableWebhookPartialGuildData.builder();
    }

    String id();

    String name();

}
