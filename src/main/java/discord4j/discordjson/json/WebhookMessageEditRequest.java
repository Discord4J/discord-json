package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookMessageEditRequest.class)
@JsonDeserialize(as = ImmutableWebhookMessageEditRequest.class)
public interface WebhookMessageEditRequest {

    static ImmutableWebhookMessageEditRequest.Builder builder() {
        return ImmutableWebhookMessageEditRequest.builder();
    }

    Possible<Optional<String>> content();

    Possible<Optional<List<EmbedData>>> embeds();

    @JsonProperty("allowed_mentions")
    Possible<Optional<AllowedMentionsData>> allowedMentions();

    Possible<Optional<List<AttachmentData>>> attachments();

    Possible<List<ComponentData>> components();

    Possible<PollCreateData> poll();
}
