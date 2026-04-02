package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeDefault;
import discord4j.discordjson.json.component.attribute.ICanBeRequired;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.ICanHaveRangedValueCount;
import discord4j.discordjson.json.component.attribute.ICanHaveValues;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import discord4j.discordjson.json.component.attribute.IHasLabel;
import discord4j.discordjson.json.component.attribute.IHaveValue;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableCheckboxGroupComponentData.class)
@JsonDeserialize(as = ImmutableCheckboxGroupComponentData.class)
public interface CheckboxGroupComponentData extends ComponentData, IHasCustomId, ICanBeRequired, ICanHaveRangedValueCount, ICanHaveValues {

    int COMPONENT_TYPE_ID = 22;

    static ImmutableCheckboxGroupComponentData.Builder builder() {
        return ImmutableCheckboxGroupComponentData.builder();
    }

    List<CheckboxGroupOptionData> options();

    @Value.Immutable
    @JsonSerialize(as = ImmutableCheckboxGroupOptionData.class)
    @JsonDeserialize(as = ImmutableCheckboxGroupOptionData.class)
    interface CheckboxGroupOptionData extends IHaveValue, IHasLabel, ICanHaveDescription, ICanBeDefault {

        static ImmutableCheckboxGroupOptionData.Builder builder() {
            return ImmutableCheckboxGroupOptionData.builder();
        }

    }

}
