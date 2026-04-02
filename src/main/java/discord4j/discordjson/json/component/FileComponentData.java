package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.UnfurledMediaItemData;
import discord4j.discordjson.json.component.attribute.ICanBeSpoiler;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableFileComponentData.class)
@JsonDeserialize(as = ImmutableFileComponentData.class)
public interface FileComponentData extends ComponentData, ICanBeSpoiler {

    int COMPONENT_TYPE_ID = 13;

    static ImmutableFileComponentData.Builder builder() {
        return ImmutableFileComponentData.builder();
    }

    UnfurledMediaItemData file();

    Possible<String> name();

    Possible<Integer> size();

}
