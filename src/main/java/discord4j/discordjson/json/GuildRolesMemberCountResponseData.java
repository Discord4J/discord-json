package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.Map;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildRolesMemberCountResponseData.class)
@JsonDeserialize(as = ImmutableGuildRolesMemberCountResponseData.class)
public interface GuildRolesMemberCountResponseData {

    static ImmutableGuildRolesMemberCountResponseData.Builder builder() {
        return ImmutableGuildRolesMemberCountResponseData.builder();
    }

    @JsonUnwrapped
    Map<Id, Integer> data();

}
