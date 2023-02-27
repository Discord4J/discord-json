package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ChannelData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadCreate.class)
@JsonDeserialize(as = ImmutableThreadCreate.class)
public interface ThreadCreate extends Dispatch {

    static ImmutableThreadCreate.Builder builder() {
        return ImmutableThreadCreate.builder();
    }

    @JsonUnwrapped
    ChannelData thread();

    @JsonProperty("newly_created")
    Possible<Boolean> newlyCreated();

}
