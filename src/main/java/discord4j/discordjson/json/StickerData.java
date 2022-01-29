package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableStickerData.class)
@JsonDeserialize(as = ImmutableStickerData.class)
public interface StickerData extends PartialStickerData {

    static ImmutableStickerData.Builder builder() {
        return ImmutableStickerData.builder();
    }

    @JsonProperty("pack_id")
    Id packId();

    Optional<String> description();

    Possible<String> tags();

    @Deprecated
    String asset();

    Possible<Boolean> available();

    int type();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    @JsonProperty("sort_value")
    Possible<Integer> sortValue();

}
