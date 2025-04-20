package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SoundboardSoundData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildSoundboardSoundUpdate.class)
@JsonDeserialize(as = ImmutableGuildSoundboardSoundUpdate.class)
public interface GuildSoundboardSoundUpdate extends Dispatch {

    static ImmutableGuildSoundboardSoundUpdate.Builder builder() {
        return ImmutableGuildSoundboardSoundUpdate.builder();
    }

    @JsonUnwrapped
    SoundboardSoundData soundboardSound();

}
