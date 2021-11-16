package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.time.Instant;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventModifyRequest.class)
public interface GuildScheduledEventModifyRequest {

    static ImmutableGuildScheduledEventModifyRequest.Builder builder() {
        return ImmutableGuildScheduledEventModifyRequest.builder();
    }

    /* Required if entity type is STAGE or VOICE channel */
    @JsonProperty("channel_id")
    Possible<Id> channelId();

    @JsonProperty("entity_metadata")
    Possible<GuildScheduledEventEntityMetadataData> entityMetadata();

    Possible<String> name();

    @JsonProperty("privacy_level")
    Possible<Integer> privacyLevel();

    @JsonProperty("scheduled_start_time")
    Possible<Instant> scheduledStartTime();

    @JsonProperty("scheduled_end_time")
    Possible<Instant> scheduledEndTime();

    Possible<String> description();

    @JsonProperty("entity_type")
    Possible<Integer> entityType();

    Possible<Integer> status();
}
