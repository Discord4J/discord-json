package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivitySecretsData.class)
public interface ActivitySecretsData {

    default Possible<String> join() { return Possible.absent(); }

    default Possible<String> spectate() { return Possible.absent(); }

    default Possible<String> match() { return Possible.absent(); }
}
