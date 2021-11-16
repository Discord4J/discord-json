package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildScheduledEventData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventUpdate.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventUpdate.class)
public interface GuildScheduledEventUpdate extends Dispatch {

    static ImmutableGuildScheduledEventUpdate.Builder builder() {
        return ImmutableGuildScheduledEventUpdate.builder();
    }

    @JsonUnwrapped
    GuildScheduledEventData scheduledEvent();
}
