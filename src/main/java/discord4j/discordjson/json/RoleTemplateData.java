package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleTemplateData.class)
@JsonDeserialize(as = ImmutableRoleTemplateData.class)
public interface RoleTemplateData extends RoleDataFields {

    static ImmutableRoleTemplateData.Builder builder() {
        return ImmutableRoleTemplateData.builder();
    }
}
