package discord4j.discordjson.json.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.json.component.attribute.ICanBeDisabled;
import discord4j.discordjson.json.component.attribute.ICanHaveCustomId;
import discord4j.discordjson.json.component.attribute.IHasStyle;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableButtonComponentData.class)
@JsonDeserialize(as = ImmutableButtonComponentData.class)
public interface ButtonComponentData extends ComponentData, ICanHaveCustomId, ICanBeDisabled, IHasStyle {

    int COMPONENT_TYPE_ID = 2;

    static ImmutableButtonComponentData.Builder builder() {
        return ImmutableButtonComponentData.builder();
    }

    Possible<String> label();

    Possible<EmojiData> emoji();

    Possible<String> url();

    @JsonProperty("sku_id")
    Possible<Id> skuId();

}
