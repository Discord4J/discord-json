package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceChannelStatusSetRequest.class)
@JsonDeserialize(as = ImmutableVoiceChannelStatusSetRequest.class)
public interface VoiceChannelStatusSetRequest {

    static ImmutableVoiceChannelStatusSetRequest.Builder builder() {
        return ImmutableVoiceChannelStatusSetRequest.builder();
    }

    Optional<String> status();

}
