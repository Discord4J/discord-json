package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStringSelectComponentData.class)
@JsonDeserialize(as = ImmutableStringSelectComponentData.class)
public interface RoleSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 6;

    static ImmutableStringSelectComponentData.Builder builder() {
        return ImmutableStringSelectComponentData.builder();
    }

}
