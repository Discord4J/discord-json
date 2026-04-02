package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeRequired;
import discord4j.discordjson.json.component.attribute.ICanHaveRangedValueCount;
import discord4j.discordjson.json.component.attribute.IHasCustomId;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableFileUploadComponentData.class)
@JsonDeserialize(as = ImmutableFileUploadComponentData.class)
public interface FileUploadComponentData extends ComponentData, IHasCustomId, ICanHaveRangedValueCount, ICanBeRequired {

    int COMPONENT_TYPE_ID = 19;

    static ImmutableFileUploadComponentData.Builder builder() {
        return ImmutableFileUploadComponentData.builder();
    }

    Possible<List<Id>> values();

}
