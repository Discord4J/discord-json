package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ApplicationCommandData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandDelete.class)
@JsonDeserialize(as = ImmutableApplicationCommandDelete.class)
public interface ApplicationCommandDelete extends Dispatch {

    static ImmutableApplicationCommandDelete.Builder builder() {
        return ImmutableApplicationCommandDelete.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    @JsonUnwrapped
    ApplicationCommandData command();
}
