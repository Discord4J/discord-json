package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.component.attribute.ICanBeSpoiler;
import discord4j.discordjson.json.component.attribute.ICanHaveDescription;
import discord4j.discordjson.json.component.attribute.IHasMedia;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMediaGalleryItemData.class)
@JsonDeserialize(as = ImmutableMediaGalleryItemData.class)
public interface MediaGalleryItemData extends IHasMedia, ICanHaveDescription, ICanBeSpoiler {

    static ImmutableMediaGalleryItemData.Builder builder() {
        return ImmutableMediaGalleryItemData.builder();
    }

}
