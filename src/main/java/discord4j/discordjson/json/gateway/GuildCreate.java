package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildCreate.class)
@JsonDeserialize(as = ImmutableGuildCreate.class)
public interface GuildCreate extends Dispatch {

    @JsonUnwrapped
    GuildData guild();
}
