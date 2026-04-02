package discord4j.discordjson.json.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.ComponentData;
import discord4j.discordjson.json.MediaGalleryItemData;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableMediaGalleryComponentData.class)
@JsonDeserialize(as = ImmutableMediaGalleryComponentData.class)
public interface MediaGalleryComponentData extends ComponentData {

    int COMPONENT_TYPE_ID = 12;

    static ImmutableMediaGalleryComponentData.Builder builder() {
        return ImmutableMediaGalleryComponentData.builder();
    }

    List<MediaGalleryItemData> items();

}
