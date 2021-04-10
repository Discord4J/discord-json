package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.IntegrationData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationCreate.class)
@JsonDeserialize(as = ImmutableIntegrationCreate.class)
public interface IntegrationCreate extends Dispatch {

    static ImmutableIntegrationCreate.Builder builder() {
        return ImmutableIntegrationCreate.builder();
    }

    @JsonProperty("guild_id")
    String guildId();

    @JsonUnwrapped
    IntegrationData integration();

}
