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
@JsonSerialize(as = ImmutableGuildScheduledEventModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventModifyRequest.class)
public interface GuildScheduledEventModifyRequest {

    static ImmutableGuildScheduledEventModifyRequest.Builder builder() {
        return ImmutableGuildScheduledEventModifyRequest.builder();
    }

    /* must be set to null if entity type is changed to external */
    @JsonProperty("channel_id")
    Possible<Optional<Id>> channelId();

    /* Required (with location) if changing entity type to external */
    @JsonProperty("entity_metadata")
    Possible<GuildScheduledEventEntityMetadataData> entityMetadata();

    Possible<String> name();

    @JsonProperty("privacy_level")
    Possible<Integer> privacyLevel();

    @JsonProperty("scheduled_start_time")
    Possible<Instant> scheduledStartTime();

    /* Required if changing entity type to external */
    @JsonProperty("scheduled_end_time")
    Possible<Instant> scheduledEndTime();

    Possible<String> description();

    @JsonProperty("entity_type")
    Possible<Integer> entityType();

    Possible<Integer> status();

    Possible<String> image();
}
