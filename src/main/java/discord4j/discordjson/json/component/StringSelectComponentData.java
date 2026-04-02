package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.component.attribute.ICanBeDefault;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.IHasLabel;
import discord4j.discordjson.json.component.attribute.IHaveValue;
import discord4j.discordjson.json.component.type.SelectComponentDataBase;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableStringSelectComponentData.class)
@JsonDeserialize(as = ImmutableStringSelectComponentData.class)
public interface StringSelectComponentData extends SelectComponentDataBase {

    int COMPONENT_TYPE_ID = 3;

    static ImmutableStringSelectComponentData.Builder builder() {
        return ImmutableStringSelectComponentData.builder();
    }

    List<StringSelectOptionData> options();

    @Value.Immutable
    @JsonSerialize(as = ImmutableStringSelectOptionData.class)
    @JsonDeserialize(as = ImmutableStringSelectOptionData.class)
    interface StringSelectOptionData extends IHaveValue, IHasLabel, ICanHaveDescription, ICanBeDefault {

        static ImmutableStringSelectOptionData.Builder builder() {
            return ImmutableStringSelectOptionData.builder();
        }

        Possible<EmojiData> emoji();

    }

}
