package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableRequestChannelInfo.class)
@JsonDeserialize(as = ImmutableRequestChannelInfo.class)
public interface RequestChannelInfo extends PayloadData {

    static ImmutableRequestChannelInfo.Builder builder() {
        return ImmutableRequestChannelInfo.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    List<String> fields();
}
