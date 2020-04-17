package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildIntegrationsUpdate.class)
@JsonDeserialize(as = ImmutableGuildIntegrationsUpdate.class)
public interface GuildIntegrationsUpdate extends Dispatch {

    static ImmutableGuildIntegrationsUpdate.Builder builder() {
        return ImmutableGuildIntegrationsUpdate.builder();
    }

    @JsonProperty("guild_id")
    String guild();
}
