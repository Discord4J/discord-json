package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerData.class)
@JsonDeserialize(as = ImmutableStickerData.class)
public interface StickerPackData {

    static ImmutableStickerData.Builder builder() {
        return ImmutableStickerData.builder();
    }

    Id id();

    Possible<List<StickerData>> stickers();

    String name();

    String description();

    @JsonProperty("sku_id")
    Id skuId();

    @JsonProperty("cover_sticker_id")
    Possible<Id> coverStickerId();

    @JsonProperty("banner_asset_id")
    Possible<Id> bannerAssetId();

}
