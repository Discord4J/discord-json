package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildMemberAddRequest.class)
@JsonDeserialize(as = ImmutableGuildMemberAddRequest.class)
public interface GuildMemberAddRequest {

    static ImmutableGuildMemberAddRequest.Builder builder() {
        return ImmutableGuildMemberAddRequest.builder();
    }

    @JsonProperty("access_token")
    String accessToken();
    String nick();
    List<String> roles();
    boolean mute();
    boolean deaf();
}
