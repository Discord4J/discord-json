package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;

import java.util.Optional;

public interface GuildUpdateFields extends GuildFields, GuildVerificationLevelField, GuildNsfwLevelField {

    @JsonProperty("owner_id")
    Id ownerId();

    Possible<Optional<String>> region();

    @JsonProperty("afk_timeout")
    int afkTimeout();

    @JsonProperty("default_message_notifications")
    int defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    int explicitContentFilter();

    @JsonProperty("mfa_level")
    int mfaLevel();

    @JsonProperty("premium_tier")
    int premiumTier();

    @JsonProperty("preferred_locale")
    String preferredLocale();
}
