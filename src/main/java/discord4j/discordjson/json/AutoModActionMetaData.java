package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModActionMetaData.class)
@JsonDeserialize(as = ImmutableAutoModActionMetaData.class)
public interface AutoModActionMetaData {

    static ImmutableAutoModActionMetaData.Builder builder() {
        return ImmutableAutoModActionMetaData.builder();
    }

    @JsonProperty("channel_id")
    Possible<Id> channelId();

    @JsonProperty("duration_seconds")
    Possible<Integer> duration();

    @JsonProperty("custom_message")
    Possible<String> customMessage();

}
