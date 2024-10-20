package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SoundboardSoundData;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildSoundboardSoundsUpdate.class)
@JsonDeserialize(as = ImmutableGuildSoundboardSoundsUpdate.class)
public interface GuildSoundboardSoundsUpdate extends Dispatch {

    static ImmutableGuildSoundboardSoundsUpdate.Builder builder() {
        return ImmutableGuildSoundboardSoundsUpdate.builder();
    }

    @JsonUnwrapped
    List<SoundboardSoundData> soundboardSound();

}
