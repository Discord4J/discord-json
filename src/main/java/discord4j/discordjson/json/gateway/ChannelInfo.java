package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ChannelInfoData;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableChannelInfo.class)
@JsonDeserialize(as = ImmutableChannelInfo.class)
public interface ChannelInfo extends Dispatch {

    static ImmutableChannelInfo.Builder builder() {
        return ImmutableChannelInfo.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    List<ChannelInfoData> channels();
}
