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

    /* Special rules apply to when this is present see https://discord.com/developers/docs/resources/guild-scheduled-event#guild-scheduled-event-object-field-requirements-by-entity-type */
    @JsonProperty("channel_id")
    Optional<Id> channelId();

    /* creator ID will be null and creator will not be included for events created before oct 25th 2021 */
    @JsonProperty("creator_id")
    Possible<Optional<Id>> creatorId();

    String name();

    Possible<Optional<String>> description();

    @JsonProperty("scheduled_start_time")
    Instant scheduledStartTime();

    /* Required if entity type is external */
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

    Possible<Optional<String>> image();

    @JsonProperty("recurrence_rule")
    Optional<RecurrenceRuleData> recurrenceRule();
}
