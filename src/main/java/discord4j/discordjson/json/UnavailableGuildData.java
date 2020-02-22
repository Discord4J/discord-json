package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUnavailableGuildData.class)
public interface UnavailableGuildData {

    String id();
    default Possible<Boolean> unavailable() { return Possible.absent(); }
}
