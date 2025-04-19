package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMediaGalleryItemData.class)
@JsonDeserialize(as = ImmutableMediaGalleryItemData.class)
public interface MediaGalleryItemData {

    static ImmutableMediaGalleryItemData.Builder builder() {
        return ImmutableMediaGalleryItemData.builder();
    }

    UnfurledMediaItemData media();
    Possible<Optional<String>> description();
    Possible<Boolean> spoiler();

}
