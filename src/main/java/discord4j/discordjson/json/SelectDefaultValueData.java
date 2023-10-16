package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSelectDefaultValueData.class)
@JsonDeserialize(as = ImmutableSelectDefaultValueData.class)
public interface SelectDefaultValueData {

    static ImmutableSelectDefaultValueData.Builder builder() {
        return ImmutableSelectDefaultValueData.builder();
    }

    Id id();

    /* "user", "role" or "channel" */
    String type();
}
