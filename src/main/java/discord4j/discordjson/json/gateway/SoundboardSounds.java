package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.SoundboardSoundData;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildSoundboardSoundCreate.class)
@JsonDeserialize(as = ImmutableGuildSoundboardSoundCreate.class)
public interface SoundboardSounds extends Dispatch {

    static ImmutableGuildSoundboardSoundCreate.Builder builder() {
        return ImmutableGuildSoundboardSoundCreate.builder();
    }

    @JsonProperty("soundboard_sounds")
    List<SoundboardSoundData> soundboardSounds();

    @JsonProperty("guild_id")
    Id guildId();

}
