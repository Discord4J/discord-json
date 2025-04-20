package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRequestSoundboardSounds.class)
@JsonDeserialize(as = ImmutableRequestSoundboardSounds.class)
public interface RequestSoundboardSounds extends PayloadData {

    static ImmutableRequestSoundboardSounds.Builder builder() {
        return ImmutableRequestSoundboardSounds.builder();
    }

    @JsonProperty("guild_ids")
    List<String> guildIds();

}
