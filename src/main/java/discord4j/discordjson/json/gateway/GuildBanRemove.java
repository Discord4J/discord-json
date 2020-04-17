package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildBanRemove.class)
@JsonDeserialize(as = ImmutableGuildBanRemove.class)
public interface GuildBanRemove extends Dispatch {

    static ImmutableGuildBanRemove.Builder builder() {
        return ImmutableGuildBanRemove.builder();
    }

    @JsonProperty("guild_id")
    String guild();
    UserData user();
}
