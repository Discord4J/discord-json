package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UnavailableGuildData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildDelete.class)
@JsonDeserialize(as = ImmutableGuildDelete.class)
public interface GuildDelete extends Dispatch {

    static ImmutableGuildDelete.Builder builder() {
        return ImmutableGuildDelete.builder();
    }

    @JsonUnwrapped
    UnavailableGuildData guild();
}
