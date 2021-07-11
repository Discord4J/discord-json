package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ChannelData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadUpdate.class)
@JsonDeserialize(as = ImmutableThreadUpdate.class)
public interface ThreadUpdate extends Dispatch {

    static ImmutableThreadUpdate.Builder builder() {
        return ImmutableThreadUpdate.builder();
    }

    @JsonUnwrapped
    ChannelData thread();
}
