package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ChannelData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadDelete.class)
@JsonDeserialize(as = ImmutableThreadDelete.class)
public interface ThreadDelete extends Dispatch {

    static ImmutableThreadDelete.Builder builder() {
        return ImmutableThreadDelete.builder();
    }

    @JsonUnwrapped
    ChannelData thread();
}

