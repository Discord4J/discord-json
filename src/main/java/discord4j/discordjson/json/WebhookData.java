package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookData.class)
@JsonDeserialize(as = ImmutableWebhookData.class)
public interface WebhookData {

    static ImmutableWebhookData.Builder builder() {
        return ImmutableWebhookData.builder();
    }

    Id id();

    int type();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("channel_id")
    Id channelId();

    Possible<UserData> user();

    Optional<String> name();

    Optional<String> avatar();

    Possible<String> token();

    @JsonProperty("application_id")
    Optional<Id> applicationId();

    @JsonProperty("source_guild")
    Possible<WebhookPartialGuildData> sourceGuild();

    @JsonProperty("source_channel")
    Possible<WebhookPartialChannelData> sourceChannel();
}
