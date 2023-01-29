package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelData.class)
@JsonDeserialize(as = ImmutableChannelData.class)
public interface ChannelData {

    static ImmutableChannelData.Builder builder() {
        return ImmutableChannelData.builder();
    }

    Id id();

    int type();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    Possible<Integer> position();

    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    Possible<String> name();

    Possible<Optional<String>> topic();

    Possible<Boolean> nsfw();

    @JsonProperty("last_message_id")
    Possible<Optional<Id>> lastMessageId();

    Possible<Integer> bitrate();

    @JsonProperty("user_limit")
    Possible<Integer> userLimit();

    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    Possible<List<UserData>> recipients();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<Id> ownerId();

    @JsonProperty("application_id")
    Possible<Id> applicationId();

    @JsonProperty("parent_id")
    Possible<Optional<Id>> parentId();

    @JsonProperty("last_pin_timestamp")
    Possible<Optional<String>> lastPinTimestamp();

    @JsonProperty("rtc_region")
    Possible<Optional<String>> rtcRegion();

    @JsonProperty("video_quality_mode")
    Possible<Integer> videoQualityMode();

    @JsonProperty("message_count")
    Possible<Integer> messageCount();

    @JsonProperty("member_count")
    Possible<Integer> memberCount();

    @JsonProperty("thread_metadata")
    Possible<ThreadMetadata> threadMetadata();

    @JsonProperty("member")
    Possible<ThreadMemberData> member();

    @JsonProperty("default_auto_archive_duration")
    Possible<Integer> defaultAutoArchiveDuration();

    Possible<Integer> flags();

    @JsonProperty("total_message_sent")
    Possible<Integer> totalMessageSent();

    @JsonProperty("available_tags")
    Possible<List<ForumTagData>> availableTags();

    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();

    @JsonProperty("default_reaction_emoji")
    Possible<Optional<DefaultReactionData>> defaultReactionEmoji();

    @JsonProperty("default_thread_rate_limit_per_user")
    Possible<Integer> defaultThreadRateLimitPerUser();

    @JsonProperty("default_sort_order")
    Possible<Optional<Integer>> defaultSortOrder();

    @JsonProperty("default_forum_layout")
    Possible<Integer> defaultForumLayout();
}
