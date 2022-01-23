package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildScheduledEventData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventCreate.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventCreate.class)
public interface GuildScheduledEventCreate extends Dispatch {

    static ImmutableGuildScheduledEventCreate.Builder builder() {
        return ImmutableGuildScheduledEventCreate.builder();
    }

    @JsonUnwrapped
    GuildScheduledEventData scheduledEvent();
}
