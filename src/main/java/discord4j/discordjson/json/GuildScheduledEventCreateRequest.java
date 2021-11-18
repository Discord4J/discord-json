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
@JsonSerialize(as = ImmutableGuildScheduledEventCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventCreateRequest.class)
public interface GuildScheduledEventCreateRequest {

    static ImmutableGuildScheduledEventCreateRequest.Builder builder() {
        return ImmutableGuildScheduledEventCreateRequest.builder();
    }

    /* should be null for events with `entity_type: EXTERNAL` */
    @JsonProperty("channel_id")
    Optional<Id> channelId();

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

    int entityType();
}
