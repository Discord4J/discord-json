package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildScheduledEventUserData.class)
@JsonDeserialize(as = ImmutableGuildScheduledEventUserData.class)
public interface GuildScheduledEventUserData {

    static ImmutableGuildScheduledEventUserData.Builder builder() {
        return ImmutableGuildScheduledEventUserData.builder();
    }

    @JsonProperty("guild_scheduled_event_id")
    Id guildScheduledEventId();

    UserData user();

    @JsonProperty("guild_member")
    Possible<PartialMemberData> guildMember();
}

