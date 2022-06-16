package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.AutoModActionData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModActionExecution.class)
@JsonDeserialize(as = ImmutableAutoModActionExecution.class)
public interface AutoModActionExecution extends Dispatch {

    static ImmutableAutoModActionExecution.Builder builder() {
        return ImmutableAutoModActionExecution.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    AutoModActionData action();

    @JsonProperty("rule_id")
    Id ruleId();

    @JsonProperty("rule_trigger_type")
    int ruleTriggerType();

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("channel_id")
    Possible<Id> channelId();

    @JsonProperty("message_id")
    Possible<Id> messageId();

    @JsonProperty("alert_system_message_id")
    Possible<Id> alertSystemMessageId();

    String content();

    @JsonProperty("matched_keyword")
    Optional<String> matchedKeyword();

    @JsonProperty("matched_content")
    Optional<String> matchedContent();
}
