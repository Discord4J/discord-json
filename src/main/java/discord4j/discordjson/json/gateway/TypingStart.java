package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.MemberData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTypingStart.class)
@JsonDeserialize(as = ImmutableTypingStart.class)
public interface TypingStart extends Dispatch {

    @JsonProperty("channel_id")
    String channelId();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }

    @JsonProperty("user_id")
    String userId();

    long timestamp();

    default Possible<MemberData> member() { return Possible.absent(); }
}
