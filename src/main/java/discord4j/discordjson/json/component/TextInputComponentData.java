package discord4j.discordjson.json.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeRequired;
import discord4j.discordjson.json.component.attribute.ICanHaveValue;
import discord4j.discordjson.json.component.attribute.ICanHavePlaceholder;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import discord4j.discordjson.json.component.attribute.IHasStyle;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTextInputComponentData.class)
@JsonDeserialize(as = ImmutableTextInputComponentData.class)
public interface TextInputComponentData extends ComponentData, IHasCustomId, ICanHaveValue, ICanBeRequired,
        ICanHavePlaceholder, IHasStyle {

    int COMPONENT_TYPE_ID = 4;

    static ImmutableTextInputComponentData.Builder builder() {
        return ImmutableTextInputComponentData.builder();
    }

    @JsonProperty("min_length")
    Possible<Integer> minLength();

    @JsonProperty("max_length")
    Possible<Integer> maxLength();

}
