package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableClientStatusData.class)
@JsonDeserialize(as = ImmutableClientStatusData.class)
public interface ClientStatusData {

    default Possible<String> desktop() { return Possible.absent(); }

    default Possible<String> mobile() { return Possible.absent(); }

    default Possible<String> web() { return Possible.absent(); }
}
