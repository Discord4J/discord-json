package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleSelectComponentData.class)
@JsonDeserialize(as = ImmutableRoleSelectComponentData.class)
public interface RoleSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 6;

    static ImmutableRoleSelectComponentData.Builder builder() {
        return ImmutableRoleSelectComponentData.builder().type(RoleSelectComponentData.COMPONENT_TYPE_ID);
    }

}
