package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.json.PartialMessageData;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableMessageUpdate.class)
public interface MessageUpdate extends Dispatch {

    @JsonUnwrapped
    PartialMessageData message();
}
