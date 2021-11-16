package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.time.Instant;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventData.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventData.class)
public interface GuildScheduledEventData {

    static ImmutableGuildScheduledEventData.Builder builder() {
        return ImmutableGuildScheduledEventData.builder();
    }

    Id id();

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("channel_id")
    Optional<Id> channelId();

    @JsonProperty("creator_id")
    Possible<Id> creatorId();

    String name();

    Possible<String> description();

    @JsonProperty("scheduled_start_time")
    Instant scheduledStartTime();

    @JsonProperty("scheduled_end_time")
    Optional<Instant> scheduledEndTime();

    @JsonProperty("privacy_level")
    int privacyLevel();

    int status();

    @JsonProperty("entity_type")
    int entityType();

    @JsonProperty("entity_id")
    Optional<Id> entityId();

    @JsonProperty("entity_metadata")
    Optional<GuildScheduledEventEntityMetadataData> entityMetadata();

    Possible<UserData> creator();

    @JsonProperty("user_count")
    Possible<Integer> userCount();
}
