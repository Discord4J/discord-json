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
@JsonSerialize(as = ImmutableChannelModifyRequest.class)
@JsonDeserialize(as = ImmutableChannelModifyRequest.class)
public interface ChannelModifyRequest {

    static ImmutableChannelModifyRequest.Builder builder() {
        return ImmutableChannelModifyRequest.builder();
    }

    Possible<String> name();

    Possible<Integer> position();

    Possible<String> topic();

    Possible<Boolean> nsfw();

    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    Possible<Integer> bitrate();

    @JsonProperty("user_limit")
    Possible<Integer> userLimit();

    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();

    @JsonProperty("rtc_region")
    Possible<Optional<String>> rtcRegion();

    @JsonProperty("video_quality_mode")
    Possible<Optional<Integer>> videoQualityMode();

    @JsonProperty("default_thread_rate_limit_per_user")
    Possible<Integer> defaultThreadRateLimitPerUser();

    @JsonProperty("default_auto_archive_duration")
    Possible<Optional<Integer>> defaultAutoArchiveDuration();

    Possible<Integer> flags();

    @JsonProperty("default_reaction_emoji")
    Possible<Optional<DefaultReactionData>> defaultReactionEmoji();

    @JsonProperty("available_tags")
    Possible<List<ForumTagParamsData>> availableTags();

    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();

    @JsonProperty("default_sort_order")
    Possible<Optional<Integer>> defaultSortOrder();

    @JsonProperty("default_forum_layout")
    Possible<Optional<Integer>> defaultForumLayout();
}
