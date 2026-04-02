package discord4j.discordjson.json.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeSpoiler;
import discord4j.discordjson.json.component.attribute.IHasChildsComponentData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableContainerComponentData.class)
@JsonDeserialize(as = ImmutableContainerComponentData.class)
public interface ContainerComponentData extends ComponentData, IHasChildsComponentData, ICanBeSpoiler {

    int COMPONENT_TYPE_ID = 17;

    static ImmutableContainerComponentData.Builder builder() {
        return ImmutableContainerComponentData.builder();
    }

    @JsonProperty("accent_color")
    Possible<Optional<Integer>> accentColor();

}
