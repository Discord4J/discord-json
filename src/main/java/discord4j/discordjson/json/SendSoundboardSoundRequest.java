package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSendSoundboardSoundRequest.class)
@JsonDeserialize(as = ImmutableSendSoundboardSoundRequest.class)
public interface SendSoundboardSoundRequest {

    static ImmutableSendSoundboardSoundRequest.Builder builder() {
        return ImmutableSendSoundboardSoundRequest.builder();
    }

    @JsonProperty("sound_id")
    Id soundId();

    @JsonProperty("source_guild_id")
    Possible<Id> sourceGuildId();

}
