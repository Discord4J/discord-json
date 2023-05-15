package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildModifyRequest.class)
public interface GuildModifyRequest {

    static ImmutableGuildModifyRequest.Builder builder() {
        return ImmutableGuildModifyRequest.builder();
    }

    Possible<String> name();

    Possible<Optional<String>> region();

    @JsonProperty("verification_level")
    Possible<Optional<Integer>> verificationLevel();

    @JsonProperty("default_message_notifications")
    Possible<Optional<Integer>> defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    Possible<Optional<Integer>> explicitContentFilter();

    @JsonProperty("afk_channel_id")
    Possible<Optional<String>> afkChannelId();

    @JsonProperty("afk_timeout")
    Possible<Integer> afkTimeout();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<String> ownerId();

    Possible<Optional<String>> splash();

    @JsonProperty("discovery_splash")
    Possible<Optional<String>> discoverySplash();

    Possible<Optional<String>> banner();

    @JsonProperty("system_channel_id")
    Possible<Optional<String>> systemChannelId();

    @JsonProperty("system_channel_flags")
    Possible<Integer> systemChannelFlags();

    @JsonProperty("rules_channel_id")
    Possible<Optional<String>> rulesChannelId();

    @JsonProperty("public_updates_channel_id")
    Possible<Optional<String>> publicUpdatesChannelId();

    @JsonProperty("preferred_locale")
    Possible<Optional<String>> preferredLocale();

    Possible<List<String>> features();

    Possible<Optional<String>> description();

    @JsonProperty("safety_alerts_channel_id")
    Possible<Optional<String>> safetyAlertsChannelId();
}
