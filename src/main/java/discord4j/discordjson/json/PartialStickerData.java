package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePartialStickerData.class)
@JsonDeserialize(as = ImmutablePartialStickerData.class)
public interface PartialStickerData {

    Id id();

    String name();

    @JsonProperty("format_type")
    int formatType();

}
