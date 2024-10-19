package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialMessageUpdateData.class)
@JsonDeserialize(as = ImmutablePartialMessageUpdateData.class)
public interface PartialMessageUpdateData extends PartialMessageData {

    static ImmutablePartialMessageUpdateData.Builder builder() {
        return ImmutablePartialMessageUpdateData.builder();
    }

    Id id();

    @JsonProperty("channel_id")
    Id channelId();

}
