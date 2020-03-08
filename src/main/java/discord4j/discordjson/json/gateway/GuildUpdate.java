package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.PartialGuildData;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildUpdate.class)
public interface GuildUpdate extends Dispatch {

    @JsonUnwrapped
    PartialGuildData guild();
}
