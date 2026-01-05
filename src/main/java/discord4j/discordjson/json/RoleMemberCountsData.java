package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.Map;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleMemberCountsData.class)
@JsonDeserialize(as = ImmutableRoleMemberCountsData.class)
public interface RoleMemberCountsData {

    static ImmutableRoleMemberCountsData.Builder builder() {
        return ImmutableRoleMemberCountsData.builder();
    }

    @JsonUnwrapped
    Map<Id, Integer> data();

}
