package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.component.attribute.ICanBeSpoiler;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.IHasMedia;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableThumbnailComponentData.class)
@JsonDeserialize(as = ImmutableThumbnailComponentData.class)
public interface ThumbnailComponentData extends ComponentData, ICanHaveDescription, ICanBeSpoiler, IHasMedia {

    int COMPONENT_TYPE_ID = 11;

    static ImmutableThumbnailComponentData.Builder builder() {
        return ImmutableThumbnailComponentData.builder();
    }

}
