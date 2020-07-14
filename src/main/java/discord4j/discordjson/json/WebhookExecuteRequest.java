package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookExecuteRequest.class)
@JsonDeserialize(as = ImmutableWebhookExecuteRequest.class)
public interface WebhookExecuteRequest {

    static ImmutableWebhookExecuteRequest.Builder builder() {
        return ImmutableWebhookExecuteRequest.builder();
    }

    Possible<String> content();
    Possible<String> username();
    @JsonProperty("avatar_url")
    Possible<String> avatar_url();
    Possible<Boolean> tts();
    Possible<List<EmbedData>> embeds();
    @JsonProperty("allowed_mentions")
    Possible<AllowedMentionsData> allowedMentions();
}
