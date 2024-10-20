package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import javax.annotation.Nullable;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableVoiceChannelEffectSend.class)
@JsonDeserialize(as = ImmutableVoiceChannelEffectSend.class)
public interface VoiceChannelEffectSend extends Dispatch {

    static ImmutableVoiceChannelEffectSend.Builder builder() {
        return ImmutableVoiceChannelEffectSend.builder();
    }

    @JsonProperty("channel_id")
    Id channelId();

    @JsonProperty("guild_id")
    Id guildId();

    @JsonProperty("user_id")
    Id userId();

    Possible<Optional<EmojiData>> emoji();

    @JsonProperty("animation_type")
    Possible<Optional<Integer>> animationType();

    @JsonProperty("animation_id")
    Possible<Integer> animationId();

    @JsonProperty("sound_id")
    Possible<Integer> soundId();

    @JsonProperty("sound_volume")
    Possible<Double> soundVolume();

}
