package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStringSelectComponentData.class)
@JsonDeserialize(as = ImmutableStringSelectComponentData.class)
public interface UserSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 5;

    static ImmutableStringSelectComponentData.Builder builder() {
        return ImmutableStringSelectComponentData.builder();
    }

}
