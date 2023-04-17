package discord4j.discordjson.json;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.time.Instant;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventCreateRequest.class)
public interface GuildScheduledEventCreateRequest {

    static ImmutableGuildScheduledEventCreateRequest.Builder builder() {
        return ImmutableGuildScheduledEventCreateRequest.builder();
    }

    /* Possible for events with entity type external */
    @JsonProperty("channel_id")
    Possible<Id> channelId();

    @JsonProperty("entity_metadata")
    Possible<GuildScheduledEventEntityMetadataData> entityMetadata();

    String name();

    @JsonProperty("privacy_level")
    int privacyLevel();

    @JsonProperty("scheduled_start_time")
    Instant scheduledStartTime();

    @JsonProperty("scheduled_end_time")
    Possible<Instant> scheduledEndTime();

    Possible<String> description();

    @JsonProperty("entity_type")
    int entityType();
}
