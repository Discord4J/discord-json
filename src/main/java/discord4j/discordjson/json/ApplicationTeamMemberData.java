package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationTeamMemberData.class)
@JsonDeserialize(as = ImmutableApplicationTeamMemberData.class)
public interface ApplicationTeamMemberData {

    static ImmutableApplicationTeamMemberData.Builder builder() {
        return ImmutableApplicationTeamMemberData.builder();
    }

    @JsonProperty("membership_state")
    int membershipState();
    List<String> permissions();
    @JsonProperty("team_id")
    Id teamId();
    UserData user();
}
