package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableResolvedChannelData.class)
@JsonDeserialize(as = ImmutableResolvedChannelData.class)
public interface ResolvedChannelData {

    static ImmutableResolvedChannelData.Builder builder() {
        return ImmutableResolvedChannelData.builder();
    }

    String id();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Optional<String>> name();

    int type();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Integer> position();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Integer> flags();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Optional<String>> permissions();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    @JsonProperty("last_message_id")
    Possible<Optional<Id>> lastMessageId();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    @JsonProperty("last_pin_timestamp")
    Possible<Optional<String>> lastPinTimestamp();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Boolean> nsfw();

    // Only provided if channel is a thread
    @JsonProperty("thread_metadata")
    Possible<ThreadMetadata> threadMetadata();

    // Only provided if channel is a thread
    @JsonProperty("parent_id")
    Possible<Optional<Id>> parentId();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    // This field can be given in a resolved channel data object, but it has the same properties as the channel object
    Possible<Optional<String>> topic();

}
