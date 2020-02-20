package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableActivityTimestampsData.class)
public interface ActivityTimestampsData {

    default Possible<Integer> start() { return Possible.absent(); }

    default Possible<Integer> end() { return Possible.absent(); }
}
