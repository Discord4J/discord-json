package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSeparatorComponentData.class)
@JsonDeserialize(as = ImmutableSeparatorComponentData.class)
public interface SeparatorComponentData extends ComponentData {

    int COMPONENT_TYPE_ID = 14;

    static ImmutableSeparatorComponentData.Builder builder() {
        return ImmutableSeparatorComponentData.builder();
    }

    Possible<Boolean> divider();

    Possible<Integer> spacing();

}
