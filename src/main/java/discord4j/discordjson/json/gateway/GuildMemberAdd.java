package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.MemberData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberAdd.class)
@JsonDeserialize(as = ImmutableGuildMemberAdd.class)
public interface GuildMemberAdd extends Dispatch {

    static ImmutableGuildMemberAdd.Builder builder() {
        return ImmutableGuildMemberAdd.builder();
    }

    @JsonProperty("guild_id")
    String guildId();
    @JsonUnwrapped
    MemberData member();
}
