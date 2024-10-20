package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildSoundboardSoundDelete.class)
@JsonDeserialize(as = ImmutableGuildSoundboardSoundDelete.class)
public interface GuildSoundboardSoundDelete extends Dispatch {

    static ImmutableGuildSoundboardSoundDelete.Builder builder() {
        return ImmutableGuildSoundboardSoundDelete.builder();
    }

    @JsonProperty("sound_id")
    Id soundId();

    @JsonProperty("guild_id")
    Id guildId();

}
