package discord4j.discordjson.encoding;

import discord4j.discordjson.component.ActionRow;
import discord4j.discordjson.component.Button;
import discord4j.discordjson.component.MessageComponent;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.possible.Possible;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecGeneratorTest {

    @Test
    public void canCreateSpecs_pr128() {
        List<ActionRow> rows = Collections.singletonList(ActionRow.of(Button.primary("id1", "A")));

        MessageCreateSpec spec = MessageCreateSpec.builder()
                .components(rows)
                .addComponent(ActionRow.of(Button.primary("id2", "B")))
                .addAllComponents(rows)
                .build()
                .withComponents(rows);

        List<ComponentData> data = spec.asRequest();
        assertEquals(1, data.size());

        ComponentData actionRow = data.get(0);
        assertEquals(MessageComponent.Type.ACTION_ROW.getValue(), actionRow.type());

        List<ComponentData> rowComponents = actionRow.components().get();
        assertEquals(1, rowComponents.size());

        ComponentData button = rowComponents.get(0);
        assertEquals("A", Possible.flatOpt(button.label()).get());
        assertEquals("id1", button.customId().get());
    }
}
