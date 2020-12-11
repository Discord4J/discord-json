package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUnavailableGuildData.class)
@JsonDeserialize(as = ImmutableUnavailableGuildData.class)
public interface UnavailableGuildData {

    static ImmutableUnavailableGuildData.Builder builder() {
        return ImmutableUnavailableGuildData.builder();
    }

    Id id();
    Possible<Boolean> unavailable();
}
