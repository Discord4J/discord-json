package discord4j.discordjson.json.gateway;

import discord4j.discordjson.json.UserData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberRemove.class)
public interface GuildMemberRemove extends Dispatch {

    @JsonProperty("guild_id")
    String guild();

    UserData user();
}
