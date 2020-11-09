package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UnavailableGuildCreateData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUnavailableGuildCreate.class)
@JsonDeserialize(as = ImmutableUnavailableGuildCreate.class)
public interface UnavailableGuildCreate extends Dispatch {

    static ImmutableUnavailableGuildCreate.Builder builder() {
        return ImmutableUnavailableGuildCreate.builder();
    }

    @JsonUnwrapped
    UnavailableGuildCreateData guild();
}
