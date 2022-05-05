package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThreadModifyRequest.class)
@JsonDeserialize(as = ImmutableThreadModifyRequest.class)
public interface ThreadModifyRequest extends ChannelModifyRequest {

    static ImmutableThreadModifyRequest.Builder builder() {
        return ImmutableThreadModifyRequest.builder();
    }

    Possible<Boolean> archived();

    @JsonProperty("auto_archive_duration")
    Possible<Integer> autoArchiveDuration();

    Possible<Boolean> locked();

    Possible<Boolean> invitable();
}
