package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialGuildData.class)
@JsonDeserialize(as = ImmutablePartialGuildData.class)
public interface PartialGuildData {

    String id();

    String name();

    Optional<String> icon();

    Optional<String> splash();

    @JsonProperty("discovery_splash")
    Optional<String> discoverySplash();

    default Possible<Boolean> owner() { return Possible.absent(); }

    @JsonProperty("owner_id")
    String ownerId();

    default Possible<Long> permissions() { return Possible.absent(); }

    String region();

    @JsonProperty("afk_channel_id")
    Optional<String> afkChannelId();

    @JsonProperty("afk_timeout")
    int afkTimeout();

    @JsonProperty("embed_enabled")
    default Possible<Boolean> embedEnabled() { return Possible.absent(); }

    @JsonProperty("embed_channel_id")
    default Possible<Optional<String>> embedChannelId() { return Possible.absent(); }

    @JsonProperty("verification_level")
    int verificationLevel();

    @JsonProperty("default_message_notifications")
    int defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    int explicitContentFilter();

    List<RoleData> roles();

    List<EmojiData> emojis();

    List<String> features();

    @JsonProperty("mfa_level")
    int mfaLevel();

    @JsonProperty("application_id")
    Optional<String> applicationId();

    @JsonProperty("widget_enabled")
    default Possible<Boolean> widgetEnabled() { return Possible.absent(); }

    @JsonProperty("widget_channel_id")
    default Possible<Optional<String>> widgetChannelId() { return Possible.absent(); }

    @JsonProperty("system_channel_id")
    Optional<String> systemChannelId();

    @JsonProperty("system_channel_flags")
    OptionalInt systemChannelFlags();

    @JsonProperty("rules_channel_id")
    Optional<String> rulesChannelId();

    @JsonProperty("max_presences")
    default Possible<Optional<Integer>> maxPresences() { return Possible.absent(); }

    @JsonProperty("max_members")
    default Possible<Integer> maxMembers() { return Possible.absent(); }

    @JsonProperty("vanity_url_code")
    Optional<String> vanityUrlCode();

    Optional<String> description();

    Optional<String> banner();

    @JsonProperty("premium_tier")
    int premiumTier();

    @JsonProperty("premium_subscription_count")
    default Possible<Integer> premiumSubscriptionCount() { return Possible.absent(); }

    @JsonProperty("preferred_locale")
    String preferredLocale();

    @JsonProperty("public_updates_channel_id")
    Optional<String> publicUpdatesChannelId();
}
