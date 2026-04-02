package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.IHasChildsComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSectionComponentData.class)
@JsonDeserialize(as = ImmutableSectionComponentData.class)
public interface SectionComponentData extends ComponentData, IHasChildsComponentData {

    int COMPONENT_TYPE_ID = 9;

    static ImmutableSectionComponentData.Builder builder() {
        return ImmutableSectionComponentData.builder();
    }

    ComponentData accessory();

}
