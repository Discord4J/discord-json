package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleData.class)
@JsonDeserialize(as = ImmutableRoleData.class)
public interface RoleData {

    static ImmutableRoleData.Builder builder() {
        return ImmutableRoleData.builder();
    }

    String id();

    String name();

    Integer color();

    Boolean hoist();

    Possible<Optional<Integer>> position();

    Long permissions();

    Possible<Optional<Boolean>> managed();

    Boolean mentionable();

    Possible<RoleTagsData> tags();
}
