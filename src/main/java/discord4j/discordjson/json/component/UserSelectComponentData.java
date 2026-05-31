package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.type.SelectComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserSelectComponentData.class)
@JsonDeserialize(as = ImmutableUserSelectComponentData.class)
public interface UserSelectComponentData extends SelectComponentData {

    int COMPONENT_TYPE_ID = 5;

    static ImmutableUserSelectComponentData.Builder builder() {
        return ImmutableUserSelectComponentData.builder().type(UserSelectComponentData.COMPONENT_TYPE_ID);
    }

}
