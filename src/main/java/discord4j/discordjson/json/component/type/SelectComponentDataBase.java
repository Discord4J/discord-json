package discord4j.discordjson.json.component.type;

import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeDisabled;
import discord4j.discordjson.json.component.attribute.ICanBeRequired;
import discord4j.discordjson.json.component.attribute.ICanHavePlaceholder;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import discord4j.discordjson.json.component.attribute.ICanHaveRangedValueCount;

public interface SelectComponentDataBase extends ComponentData, IHasCustomId, ICanBeDisabled, ICanHaveRangedValueCount,
        ICanBeRequired, ICanHavePlaceholder {
}
