package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStartThreadFromMessageRequest.class)
@JsonDeserialize(as = ImmutableStartThreadFromMessageRequest.class)
public interface StartThreadFromMessageRequest {

    static ImmutableStartThreadFromMessageRequest.Builder builder() {
        return ImmutableStartThreadFromMessageRequest.builder();
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
    Possible<Integer> rateLimitPerUser();
}
