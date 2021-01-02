package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ApplicationCommandData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandCreate.class)
@JsonDeserialize(as = ImmutableApplicationCommandCreate.class)
public interface ApplicationCommandCreate extends Dispatch {

    static ImmutableApplicationCommandCreate.Builder builder() {
        return ImmutableApplicationCommandCreate.builder();
    }

    @JsonProperty("guild_id")
    String guildId();

    @JsonUnwrapped
    ApplicationCommandData command();
}
