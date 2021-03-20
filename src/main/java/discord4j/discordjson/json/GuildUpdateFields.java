package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.Id;

import java.util.Optional;

public interface GuildUpdateFields extends GuildFields, GuildVerificationLevelField {

    @JsonProperty("owner_id")
    Id ownerId();

    String region();

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

    // TODO: FIX discord docs, as this can be null from GUILD_CREATE
    @JsonProperty("preferred_locale")
    Optional<String> preferredLocale();
}
