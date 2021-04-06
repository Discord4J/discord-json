package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationDelete.class)
@JsonDeserialize(as = ImmutableIntegrationDelete.class)
public interface IntegrationDelete extends Dispatch {

    static ImmutableIntegrationDelete.Builder builder() {
        return ImmutableIntegrationDelete.builder();
    }

    String id();

    @JsonProperty("guild_id")
    String guildId();

    @JsonProperty("application_id")
    Possible<String> applicationId();

}
