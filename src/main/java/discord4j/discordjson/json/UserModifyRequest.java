package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserModifyRequest.class)
@JsonDeserialize(as = ImmutableUserModifyRequest.class)
public interface UserModifyRequest {

    static ImmutableUserModifyRequest.Builder builder() {
        return ImmutableUserModifyRequest.builder();
    }

    Possible<? extends String> username();
    Possible<? extends String> avatar();
}
