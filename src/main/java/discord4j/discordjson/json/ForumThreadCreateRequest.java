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
@JsonSerialize(as = ImmutableForumThreadCreateRequest.class)
@JsonDeserialize(as = ImmutableForumThreadCreateRequest.class)
public interface ForumThreadCreateRequest {

    static ImmutableForumThreadCreateRequest.Builder builder() {
        return ImmutableForumThreadCreateRequest.builder();
    }

    String name();

    @JsonProperty("auto_archive_duration")
    Possible<Integer> autoArchiveDuration();

    @JsonProperty("rate_limit_per_user")
    Possible<Optional<Integer>> rateLimitPerUser();

    ForumThreadMessageParamsData message();

    @JsonProperty("applied_tags")
    Possible<List<Id>> appliedTags();

}
