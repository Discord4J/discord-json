package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildScheduledEventData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventDelete.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventDelete.class)
public interface GuildScheduledEventDelete extends Dispatch {

    static ImmutableGuildScheduledEventDelete.Builder builder() {
        return ImmutableGuildScheduledEventDelete.builder();
    }

    @JsonUnwrapped
    GuildScheduledEventData scheduledEvent();
}
