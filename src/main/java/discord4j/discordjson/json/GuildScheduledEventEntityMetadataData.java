package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventEntityMetadataData.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventEntityMetadataData.class)
public interface GuildScheduledEventEntityMetadataData {

    static ImmutableGuildScheduledEventEntityMetadataData.Builder builder() {
        return ImmutableGuildScheduledEventEntityMetadataData.builder();
    }

    /* Required for events with entity type external */
    Possible<String> location();
}
