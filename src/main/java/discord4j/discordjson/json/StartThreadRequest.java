package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStartThreadRequest.class)
@JsonDeserialize(as = ImmutableStartThreadRequest.class)
public interface StartThreadRequest {

    static ImmutableStartThreadRequest.Builder builder() {
        return ImmutableStartThreadRequest.builder();
    }

    String name();

    @JsonProperty("auto_archive_duration")
    int autoArchiveDuration();

    /**
     * the type of thread to create
     * Only available without message
     */
    int type();

    /**
     * whether non-moderators can add other non-moderators to a thread; only available when creating a private thread
     */
    boolean invitable();

    /**
     * amount of seconds a user has to wait before sending another message (0-21600)
     */
    @JsonProperty("rate_limit_per_user")
    int rateLimitPerUser();
}
