package com.discord4j.discordjson.json;

import com.discord4j.discordjson.json.gateway.PresenceUpdate;
import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildData.class)
public interface GuildData {

    String id();

    String name();

    Optional<String> icon();

    Optional<String> splash();

    Possible<Boolean> owner();

    @JsonProperty("owner_id")
    String ownerId();

    Possible<Long> permissions();

    String region();

    @JsonProperty("afk_channel_id")
    Optional<String> afkChannelId();

    @JsonProperty("afk_timeout")
    int afkTimeout();

    @JsonProperty("embed_enabled")
    Possible<Boolean> embedEnabled();

    @JsonProperty("embed_channel_id")
    Possible<String> embedChannelId();

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
    Possible<Boolean> widgetEnabled();

    @JsonProperty("widget_channel_id")
    Possible<String> widgetChannelId();

    @JsonProperty("system_channel_id")
    Optional<String> systemChannelId();

    @JsonProperty("joined_at")
    Possible<String> joinedAt();

    Possible<Boolean> large();

    Possible<Boolean> unavailable();

    @JsonProperty("member_count")
    Possible<Integer> memberCount();

    @JsonProperty("voice_states")
    Possible<List<VoiceStateData>> voiceStates();

    Possible<List<MemberData>> members();

    Possible<List<ChannelData>> channels();

    Possible<List<PresenceUpdate>> presences();

    @JsonProperty("max_presences")
    Possible<Optional<Integer>> maxPresences();

    @JsonProperty("max_members")
    Possible<Integer> maxMembers();

    @JsonProperty("vanity_url_code")
    Optional<String> vanityUrlCode();

    Optional<String> description();

    Optional<String> banner();

    @JsonProperty("premium_tier")
    int premiumTier();

    @JsonProperty("premium_subscription_count")
    Possible<Integer> premiumSubscriptionCount();

    @JsonProperty("preferred_locale")
    String preferredLocale();
}
