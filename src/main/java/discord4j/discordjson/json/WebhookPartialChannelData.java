package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookPartialChannelData.class)
@JsonDeserialize(as = ImmutableWebhookPartialChannelData.class)
public interface WebhookPartialChannelData {

    static ImmutableWebhookPartialChannelData.Builder builder() {
        return ImmutableWebhookPartialChannelData.builder();
    }

    String id();

    String name();

}
