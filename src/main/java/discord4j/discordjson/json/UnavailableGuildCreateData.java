package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUnavailableGuildCreateData.class)
@JsonDeserialize(as = ImmutableUnavailableGuildCreateData.class)
public interface UnavailableGuildCreateData {

    static ImmutableUnavailableGuildCreateData.Builder builder() {
        return ImmutableUnavailableGuildCreateData.builder();
    }

    Id id();

    boolean unavailable();
}
