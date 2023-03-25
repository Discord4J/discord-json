package discord4j.discordjson.encoding;

import discord4j.discordjson.component.LayoutComponent;
import discord4j.discordjson.component.MessageComponent;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Value.Immutable(singleton = true)
public interface MessageCreateSpecGenerator {

    Possible<List<LayoutComponent>> components();

    default List<ComponentData> asRequest() {
        if (components().isAbsent()) {
            return Collections.emptyList();
        }
        return components().get()
                .stream()
                .map(MessageComponent::getData)
                .collect(Collectors.toList());
    }

}
