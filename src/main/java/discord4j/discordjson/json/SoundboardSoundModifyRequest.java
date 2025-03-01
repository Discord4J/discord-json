package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSoundboardSoundModifyRequest.class)
@JsonDeserialize(as = ImmutableSoundboardSoundModifyRequest.class)
public interface SoundboardSoundModifyRequest {

    static ImmutableSoundboardSoundModifyRequest.Builder builder() {
        return ImmutableSoundboardSoundModifyRequest.builder();
    }

    Possible<String> name();

    Possible<String> sound();

    Possible<Optional<Double>> volume();

    @JsonProperty("emoji_id")
    Possible<Optional<Id>> emojiId();

    @JsonProperty("emoji_name")
    Possible<Optional<String>> emojiName();

}
