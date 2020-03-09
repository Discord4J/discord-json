package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserModifyRequest.class)
@JsonDeserialize(as = ImmutableUserModifyRequest.class)
public interface UserModifyRequest {

    default Possible<String> username() { return Possible.absent(); }
    default Possible<String> avatar() { return Possible.absent(); }
}
