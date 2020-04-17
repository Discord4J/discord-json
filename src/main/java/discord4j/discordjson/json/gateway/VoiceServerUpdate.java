package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceServerUpdate.class)
@JsonDeserialize(as = ImmutableVoiceServerUpdate.class)
public interface VoiceServerUpdate extends Dispatch {

    static ImmutableVoiceServerUpdate.Builder builder() {
        return ImmutableVoiceServerUpdate.builder();
    }

    String token();
    @JsonProperty("guild_id")
    String guildId();
    String endpoint();
}
