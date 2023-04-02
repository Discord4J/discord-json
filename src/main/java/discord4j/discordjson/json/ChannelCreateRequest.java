package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelCreateRequest.class)
@JsonDeserialize(as = ImmutableChannelCreateRequest.class)
public interface ChannelCreateRequest {

    static ImmutableChannelCreateRequest.Builder builder() {
        return ImmutableChannelCreateRequest.builder();
    }

    String name();

    Possible<Integer> type();

    Possible<String> topic();

    Possible<Integer> bitrate();

    @JsonProperty("user_limit")
    Possible<Integer> userLimit();

    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    Possible<Integer> position();

    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    @JsonProperty("parent_id")
    Possible<String> parentId();

    Possible<Boolean> nsfw();

    @JsonProperty("default_thread_rate_limit_per_user")
    Possible<Integer> defaultThreadRateLimitPerUser();

    Possible<Integer> flags();

    @JsonProperty("default_auto_archive_duration")
    Possible<Optional<Integer>> defaultAutoArchiveDuration();

    @JsonProperty("default_reaction_emoji")
    Possible<Optional<DefaultReactionData>> defaultReactionEmoji();

    @JsonProperty("available_tags")
    Possible<List<ForumTagData>> availableTags();

    @JsonProperty("default_sort_order")
    Possible<Optional<Integer>> defaultSortOrder();

    @JsonProperty("default_forum_layout")
    Possible<Optional<Integer>> defaultForumLayout();

}
