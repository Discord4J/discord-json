package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

interface GuildFields {

    String id();

    String name();

    Optional<String> icon();

    Optional<String> splash();

    @JsonProperty("discovery_splash")
    Optional<String> discoverySplash();

    Possible<Boolean> owner();

    Possible<Long> permissions();

    @JsonProperty("afk_channel_id")
    Optional<String> afkChannelId();

    @JsonProperty("embed_enabled")
    Possible<Boolean> embedEnabled();

    @JsonProperty("embed_channel_id")
    Possible<Optional<String>> embedChannelId();

    List<String> features();

    @JsonProperty("application_id")
    Optional<String> applicationId();

    @JsonProperty("widget_enabled")
    Possible<Boolean> widgetEnabled();

    @JsonProperty("widget_channel_id")
    Possible<Optional<String>> widgetChannelId();

    @JsonProperty("system_channel_id")
    Optional<String> systemChannelId();

    @JsonProperty("system_channel_flags")
    OptionalInt systemChannelFlags();

    @JsonProperty("rules_channel_id")
    Optional<String> rulesChannelId();

    @JsonProperty("max_presences")
    Possible<Optional<Integer>> maxPresences();

    @JsonProperty("max_members")
    Possible<Integer> maxMembers();

    @JsonProperty("vanity_url_code")
    Optional<String> vanityUrlCode();

    Optional<String> description();

    Optional<String> banner();

    // TODO: while https://github.com/discordapp/discord-api-docs/pull/1443 is resolved
    @JsonProperty("premium_subscription_count")
    Possible<Optional<Integer>> premiumSubscriptionCount();

    @JsonProperty("public_updates_channel_id")
    Optional<String> publicUpdatesChannelId();

    @JsonProperty("approximate_member_count")
    Possible<Integer> approximateMemberCount();

    @JsonProperty("approximate_presence_count")
    Possible<Integer> approximatePresenceCount();
}
