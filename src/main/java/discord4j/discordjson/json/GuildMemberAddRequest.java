package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildMemberAddRequest.class)
public interface GuildMemberAddRequest {

    @JsonProperty("access_token")
    String accessToken();
    String nick();
    List<String> roles();
    boolean mute();
    boolean deaf();
}
