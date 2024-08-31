package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.PartialMessageUpdateData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMessageUpdate.class)
@JsonDeserialize(as = ImmutableMessageUpdate.class)
public interface MessageUpdate extends Dispatch {

    static ImmutableMessageUpdate.Builder builder() {
        return ImmutableMessageUpdate.builder();
    }

    @JsonUnwrapped
    PartialMessageUpdateData message();
}
