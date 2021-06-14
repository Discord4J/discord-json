package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationTeamData.class)
@JsonDeserialize(as = ImmutableApplicationTeamData.class)
public interface ApplicationTeamData {

    static ImmutableApplicationTeamData.Builder builder() {
        return ImmutableApplicationTeamData.builder();
    }

    Optional<String> icon();

    Id id();

    List<ApplicationTeamMemberData> members();

    String name();

    @JsonProperty("owner_user_id")
    Id ownerUserId();

}
