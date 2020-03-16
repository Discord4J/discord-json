package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildUpdateData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildUpdate.class)
@JsonDeserialize(as = ImmutableGuildUpdate.class)
public interface GuildUpdate extends Dispatch {

    @JsonUnwrapped
    GuildUpdateData guild();
}
