package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.MessageData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageCreate.class)
@JsonDeserialize(as = ImmutableMessageCreate.class)
public interface MessageCreate extends Dispatch {

    @JsonUnwrapped
    MessageData message();
}
