package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildUpdateData.class)
@JsonDeserialize(as = ImmutableGuildUpdateData.class)
public interface GuildUpdateData extends GuildUpdateFields, GuildRolesEmojisStickersFields {

    static ImmutableGuildUpdateData.Builder builder() {
        return ImmutableGuildUpdateData.builder();
    }
}
