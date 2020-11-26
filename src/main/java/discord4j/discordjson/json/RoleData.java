package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleData.class)
@JsonDeserialize(as = ImmutableRoleData.class)
public interface RoleData {

    static ImmutableRoleData.Builder builder() {
        return ImmutableRoleData.builder();
    }

    String id();

    String name();

    int color();

    boolean hoist();

    int position();

    long permissions();

    boolean managed();

    boolean mentionable();

    Possible<RoleTagsData> tags();
}
