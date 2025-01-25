package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SoundboardSoundData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildSoundboardSoundCreate.class)
@JsonDeserialize(as = ImmutableGuildSoundboardSoundCreate.class)
public interface GuildSoundboardSoundCreate extends Dispatch {

    static ImmutableGuildSoundboardSoundCreate.Builder builder() {
        return ImmutableGuildSoundboardSoundCreate.builder();
    }

    @JsonUnwrapped
    SoundboardSoundData soundboardSound();

}
