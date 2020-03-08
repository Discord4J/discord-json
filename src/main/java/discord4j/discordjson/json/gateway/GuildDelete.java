package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.UnavailableGuildData;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildDelete.class)
public interface GuildDelete extends Dispatch {

    @JsonUnwrapped
    UnavailableGuildData guild();
}
