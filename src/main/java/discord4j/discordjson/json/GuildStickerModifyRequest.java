package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildStickerModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildStickerModifyRequest.class)
public interface GuildStickerModifyRequest {

    static ImmutableGuildStickerModifyRequest.Builder builder() {
        return ImmutableGuildStickerModifyRequest.builder();
    }

    Possible<String> name();
    Possible<String> description();
    Possible<String> tags();
}
