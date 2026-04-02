package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.IHasLabel;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableLabelComponentData.class)
@JsonDeserialize(as = ImmutableLabelComponentData.class)
public interface LabelComponentData extends ComponentData, IHasLabel, ICanHaveDescription {

    int COMPONENT_TYPE_ID = 18;

    static ImmutableLabelComponentData.Builder builder() {
        return ImmutableLabelComponentData.builder();
    }

    ComponentData component();

}
