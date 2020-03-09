package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityTimestampsData.class)
@JsonDeserialize(as = ImmutableActivityTimestampsData.class)
public interface ActivityTimestampsData {

    default Possible<Long> start() { return Possible.absent(); }

    default Possible<Long> end() { return Possible.absent(); }
}
