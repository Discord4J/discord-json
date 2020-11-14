package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerData.class)
@JsonDeserialize(as = ImmutableStickerData.class)
public interface StickerData {

    static ImmutableStickerData.Builder builder() {
        return ImmutableStickerData.builder();
    }

    String id();

    @JsonProperty("pack_id")
    String packId();

    String name();

    String description();

    Possible<String> tags();

    String asset();

    @JsonProperty("preview_asset")
    Optional<String> previewAsset();

    @JsonProperty("format_type")
    int formatType();

}
