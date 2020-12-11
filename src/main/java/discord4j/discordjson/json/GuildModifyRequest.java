package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildModifyRequest.class)
public interface GuildModifyRequest {

    static ImmutableGuildModifyRequest.Builder builder() {
        return ImmutableGuildModifyRequest.builder();
    }

    Possible<String> name();

    Possible<String> region();

    @JsonProperty("verification_level")
    Possible<Integer> verificationLevel();

    @JsonProperty("default_message_notifications")
    Possible<Integer> defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    Possible<Integer> explicitContentFilter();

    @JsonProperty("afk_channel_id")
    Possible<Optional<Id>> afkChannelId();

    @JsonProperty("afk_timeout")
    Possible<Integer> afkTimeout();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<Id> ownerId();

    Possible<Optional<String>> splash();

    Possible<Optional<String>> banner();

    @JsonProperty("system_channel_id")
    Possible<Id> systemChannelId();

    @JsonProperty("rules_channel_id")
    Possible<Id> rulesChannelId();

    @JsonProperty("public_updates_channel_id")
    Possible<Id> publicUpdatesChannelId();

    @JsonProperty("preferred_locale")
    Possible<String> preferredLocale();
}
