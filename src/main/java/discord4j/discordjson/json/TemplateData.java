package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableTemplateData.class)
@JsonDeserialize(as = ImmutableTemplateData.class)
public interface TemplateData {

    static ImmutableTemplateData.Builder builder() {
        return ImmutableTemplateData.builder();
    }

    String code();
    String name();
    Optional<String> description();
    @JsonProperty("usage_count")
    Integer usageCount();
    @JsonProperty("creator_id")
    String creatorId();
    UserData creator();
    @JsonProperty("created_at")
    String createdAt();
    @JsonProperty("updated_at")
    String updatedAt();
    @JsonProperty("source_guild_id")
    String sourceGuildId();
    @JsonProperty("serialized_source_guild")
    SerializedSourceGuildData serializedSourceGuild();
    @JsonProperty("is_dirty")
    Optional<Boolean> isDirty();
}
