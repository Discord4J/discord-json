package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface GuildFields {

    Id id();

    String name();

    Optional<String> icon();

    Optional<String> splash();

    @JsonProperty("discovery_splash")
    Optional<String> discoverySplash();

    Possible<Boolean> owner();

    Possible<Long> permissions();

    @JsonProperty("afk_channel_id")
    Optional<Id> afkChannelId();

    @Deprecated
    @JsonProperty("embed_enabled")
    Possible<Boolean> embedEnabled();

    @Deprecated
    @JsonProperty("embed_channel_id")
    Possible<Optional<Id>> embedChannelId();

    List<String> features();

    @JsonProperty("application_id")
    Optional<Id> applicationId();

    @JsonProperty("widget_enabled")
    Possible<Boolean> widgetEnabled();

    @JsonProperty("widget_channel_id")
    Possible<Optional<Id>> widgetChannelId();

    @JsonProperty("system_channel_id")
    Optional<Id> systemChannelId();

    @JsonProperty("system_channel_flags")
    OptionalInt systemChannelFlags();

    @JsonProperty("rules_channel_id")
    Optional<Id> rulesChannelId();

    @JsonProperty("max_presences")
    Possible<Optional<Integer>> maxPresences();

    @JsonProperty("max_members")
    Possible<Integer> maxMembers();

    @JsonProperty("vanity_url_code")
    Optional<String> vanityUrlCode();

    Optional<String> description();

    Optional<String> banner();

    @JsonProperty("premium_subscription_count")
    Possible<Integer> premiumSubscriptionCount();

    @JsonProperty("public_updates_channel_id")
    Optional<Id> publicUpdatesChannelId();

    @JsonProperty("max_video_channel_users")
    Possible<Integer> maxVideoChannelUsers();

    @JsonProperty("approximate_member_count")
    Possible<Integer> approximateMemberCount();

    @JsonProperty("approximate_presence_count")
    Possible<Integer> approximatePresenceCount();

    @JsonProperty("welcome_screen")
    Possible<WelcomeScreenData> welcomeScreen();
}
