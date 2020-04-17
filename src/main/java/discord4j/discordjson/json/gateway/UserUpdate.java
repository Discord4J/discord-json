package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.UserData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserUpdate.class)
@JsonDeserialize(as = ImmutableUserUpdate.class)
public interface UserUpdate extends Dispatch {

    static ImmutableUserUpdate.Builder builder() {
        return ImmutableUserUpdate.builder();
    }

    @JsonUnwrapped
    UserData user();
}
