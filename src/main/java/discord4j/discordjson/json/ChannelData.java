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
    Possible<? extends String> guildId();

    Possible<? extends Integer> position();

    @JsonProperty("permission_overwrites")
    Possible<List<OverwriteData>> permissionOverwrites();

    Possible<? extends String> name();

    Possible<Optional<String>> topic();

    Possible<? extends Boolean> nsfw();

    @JsonProperty("last_message_id")
    Possible<Optional<String>> lastMessageId();

    Possible<? extends Integer> bitrate();

    @JsonProperty("user_limit")
    Possible<? extends Integer> userLimit();

    @JsonProperty("rate_limit_per_user")
    Possible<? extends Integer> rateLimitPerUser();

    Possible<List<UserData>> recipients();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<? extends String> ownerId();

    @JsonProperty("application_id")
    Possible<? extends String> applicationId();

    @JsonProperty("parent_id")
    Possible<Optional<String>> parentId();

    // TODO GuildCreate can contain null last_pin_timestamp field!
    @JsonProperty("last_pin_timestamp")
    Possible<Optional<String>> lastPinTimestamp();
}
