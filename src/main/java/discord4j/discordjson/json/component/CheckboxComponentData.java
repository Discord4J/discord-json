package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeDefault;
import discord4j.discordjson.json.component.attribute.ICanHaveValue;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableCheckboxComponentData.class)
@JsonDeserialize(as = ImmutableCheckboxComponentData.class)
public interface CheckboxComponentData extends ComponentData, IHasCustomId, ICanBeDefault, ICanHaveValue {

    int COMPONENT_TYPE_ID = 23;

    static ImmutableCheckboxComponentData.Builder builder() {
        return ImmutableCheckboxComponentData.builder();
    }

}
