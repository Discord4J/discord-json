package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelInfoData.class)
@JsonDeserialize(as = ImmutableChannelInfoData.class)
public interface ChannelInfoData {

    static ImmutableChannelInfoData.Builder builder() {
        return ImmutableChannelInfoData.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    Possible<Optional<String>> status();

    @JsonProperty("voice_start_time")
    Possible<Optional<Integer>> voiceStartTime();
}
