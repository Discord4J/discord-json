package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleTemplateData.class)
@JsonDeserialize(as = ImmutableRoleTemplateData.class)
public interface RoleTemplateData extends RoleDataFields {

    static ImmutableRoleTemplateData.Builder builder() {
        return ImmutableRoleTemplateData.builder();
    }
}
