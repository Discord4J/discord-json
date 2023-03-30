package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStartThreadInForumChannelRequest.class)
@JsonDeserialize(as = ImmutableStartThreadInForumChannelRequest.class)
public interface StartThreadInForumChannelRequest {

    static ImmutableStartThreadInForumChannelRequest.Builder builder() {
        return ImmutableStartThreadInForumChannelRequest.builder();
    }

    /**
     * 1-100 character channel name
     */
    String name();

    /**
     * duration in minutes to automatically archive the thread after recent activity, can be set to: 60, 1440, 4320, 10080
     */
    @JsonProperty("auto_archive_duration")
    Possible<Integer> autoArchiveDuration();

    /**
     * amount of seconds a user has to wait before sending another message (0-21600)
     */
    @JsonProperty("rate_limit_per_user")
    Possible<Optional<Integer>> rateLimitPerUser();

    /**
     * the thread message which starts the thread
     */
    ForumThreadMessageParamsData message();

    /**
     * array of snowflakes containing the applied tags id
     */
    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();

}
