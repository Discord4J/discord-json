package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialGuildData.class)
@JsonDeserialize(as = ImmutablePartialGuildData.class)
public interface PartialGuildData extends GuildFields, GuildVerificationLevelField, GuildNsfwLevelField {

    static ImmutablePartialGuildData.Builder builder() {
        return ImmutablePartialGuildData.builder();
    }
}
