package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeDefault;
import discord4j.discordjson.json.component.attribute.ICanBeRequired;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.ICanHaveValue;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import discord4j.discordjson.json.component.attribute.IHasLabel;
import discord4j.discordjson.json.component.attribute.IHaveValue;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableRadioGroupComponentData.class)
@JsonDeserialize(as = ImmutableRadioGroupComponentData.class)
public interface RadioGroupComponentData extends ComponentData, IHasCustomId, ICanBeRequired, ICanHaveValue {

    int COMPONENT_TYPE_ID = 21;

    static ImmutableRadioGroupComponentData.Builder builder() {
        return ImmutableRadioGroupComponentData.builder();
    }

    List<RadioGroupOptionData> options();

    @Value.Immutable
    @JsonSerialize(as = ImmutableRadioGroupOptionData.class)
    @JsonDeserialize(as = ImmutableRadioGroupOptionData.class)
    interface RadioGroupOptionData extends IHaveValue, IHasLabel, ICanHaveDescription, ICanBeDefault {

        static ImmutableRadioGroupOptionData.Builder builder() {
            return ImmutableRadioGroupOptionData.builder();
        }

    }

}
