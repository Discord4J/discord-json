package discord4j.discordjson.json;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSoundboardSoundData.class)
@JsonDeserialize(as = ImmutableSoundboardSoundData.class)
public interface SoundboardSoundData {

    static ImmutableSoundboardSoundData.Builder builder() {
        return ImmutableSoundboardSoundData.builder();
    }

    String name();

    @JsonProperty("sound_id")
    Id soundId();

    double volume();

    @JsonProperty("emoji_id")
    Optional<Id> emojiId();

    @JsonProperty("emoji_name")
    Optional<String> emojiName();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    boolean available();

    Possible<UserData> user();

}
