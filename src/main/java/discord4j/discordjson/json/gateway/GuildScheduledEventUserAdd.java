package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

/**
 * Note: This event is considered experimental by Discord.
 * <a href="https://discord.com/developers/docs/topics/gateway#guild-scheduled-event-user-add">Discord</a>
 */
@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventUserAdd.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventUserAdd.class)
public interface GuildScheduledEventUserAdd extends Dispatch {

    static ImmutableGuildScheduledEventUserAdd.Builder builder() {
        return ImmutableGuildScheduledEventUserAdd.builder();
    }

    @JsonProperty("guild_scheduled_event_id")
    Id scheduledEventId();

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("guild_id")
    Id guildId();
}
