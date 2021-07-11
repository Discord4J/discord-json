package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildCreateData.class)
@JsonDeserialize(as = ImmutableGuildCreateData.class)
public interface GuildCreateData extends GuildCreateFields, GuildRolesEmojisFields {

    static ImmutableGuildCreateData.Builder builder() {
        return ImmutableGuildCreateData.builder();
    }

    @JsonProperty("voice_states")
    List<VoiceStateData> voiceStates();

    List<MemberData> members();

    List<ChannelData> channels();

    List<ChannelData> threads();

    List<PresenceData> presences();


}
