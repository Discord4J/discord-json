package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.IHasChildsComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableActionRowComponentData.class)
@JsonDeserialize(as = ImmutableActionRowComponentData.class)
public interface ActionRowComponentData extends ComponentData, IHasChildsComponentData {

    int COMPONENT_TYPE_ID = 1;

    static ImmutableActionRowComponentData.Builder builder() {
        return ImmutableActionRowComponentData.builder();
    }

}
