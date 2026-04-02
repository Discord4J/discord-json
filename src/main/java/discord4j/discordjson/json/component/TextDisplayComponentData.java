package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableTextDisplayComponentData.class)
@JsonDeserialize(as = ImmutableTextDisplayComponentData.class)
public interface TextDisplayComponentData extends ComponentData {

    int COMPONENT_TYPE_ID = 10;

    static ImmutableTextDisplayComponentData.Builder builder() {
        return ImmutableTextDisplayComponentData.builder();
    }

    String content();

}
