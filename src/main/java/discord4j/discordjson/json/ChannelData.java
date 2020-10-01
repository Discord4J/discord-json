package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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

    String id();

    int type();

    @JsonProperty("guild_id")
    Possible<String> guildId();

    Possible<Integer> position();

    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    Possible<String> name();

    Possible<Optional<String>> topic();

    Possible<Boolean> nsfw();

    @JsonProperty("last_message_id")
    Possible<Optional<String>> lastMessageId();

    Possible<Integer> bitrate();

    @JsonProperty("user_limit")
    Possible<Integer> userLimit();

    @JsonProperty("rate_limit_per_user")
    Possible<Integer> rateLimitPerUser();

    Possible<List<UserData>> recipients();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<String> ownerId();

    @JsonProperty("application_id")
    Possible<String> applicationId();

    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();

    @JsonProperty("last_pin_timestamp")
    Possible<Optional<String>> lastPinTimestamp();
}
