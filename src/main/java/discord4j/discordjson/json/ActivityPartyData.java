package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableActivityPartyData.class)
@JsonDeserialize(as = ImmutableActivityPartyData.class)
public interface ActivityPartyData {

    default Possible<String> id() { return Possible.absent(); }

    default Possible<List<Long>> size() { return Possible.absent(); }
}
