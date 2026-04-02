package discord4j.discordjson.json.parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.ActionRowComponentData;
import discord4j.discordjson.json.component.ButtonComponentData;
import discord4j.discordjson.json.component.ChannelSelectComponentData;
import discord4j.discordjson.json.component.CheckboxComponentData;
import discord4j.discordjson.json.component.CheckboxGroupComponentData;
import discord4j.discordjson.json.component.ContainerComponentData;
import discord4j.discordjson.json.component.FileComponentData;
import discord4j.discordjson.json.component.FileUploadComponentData;
import discord4j.discordjson.json.component.LabelComponentData;
import discord4j.discordjson.json.component.MediaGalleryComponentData;
import discord4j.discordjson.json.component.MentionableSelectComponentData;
import discord4j.discordjson.json.component.RadioGroupComponentData;
import discord4j.discordjson.json.component.RoleSelectComponentData;
import discord4j.discordjson.json.component.SectionComponentData;
import discord4j.discordjson.json.component.SeparatorComponentData;
import discord4j.discordjson.json.component.StringSelectComponentData;
import discord4j.discordjson.json.component.TextDisplayComponentData;
import discord4j.discordjson.json.component.TextInputComponentData;
import discord4j.discordjson.json.component.ThumbnailComponentData;
import discord4j.discordjson.json.component.UserSelectComponentData;

import java.io.IOException;

public class ComponentParser extends JsonDeserializer<ComponentData> {

    @Override
    public ComponentData deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        int typeId = (Integer) node.get("type").numberValue();

        switch (typeId) {
            case ActionRowComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(ActionRowComponentData.class);
            case ButtonComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(ButtonComponentData.class);
            case StringSelectComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(StringSelectComponentData.class);
            case TextInputComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(TextInputComponentData.class);
            case UserSelectComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(UserSelectComponentData.class);
            case RoleSelectComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(RoleSelectComponentData.class);
            case MentionableSelectComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(MentionableSelectComponentData.class);
            case ChannelSelectComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(ChannelSelectComponentData.class);
            case SectionComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(SectionComponentData.class);
            case TextDisplayComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(TextDisplayComponentData.class);
            case ThumbnailComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(ThumbnailComponentData.class);
            case MediaGalleryComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(MediaGalleryComponentData.class);
            case FileComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(FileComponentData.class);
            case SeparatorComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(SeparatorComponentData.class);
            case ContainerComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(ContainerComponentData.class);
            case LabelComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(LabelComponentData.class);
            case FileUploadComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(FileUploadComponentData.class);
            case RadioGroupComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(RadioGroupComponentData.class);
            case CheckboxGroupComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(CheckboxGroupComponentData.class);
            case CheckboxComponentData.COMPONENT_TYPE_ID:
                return jsonParser.readValueAs(CheckboxComponentData.class);
            default:
                return jsonParser.readValueAs(ComponentData.class);
        }
    }

}
