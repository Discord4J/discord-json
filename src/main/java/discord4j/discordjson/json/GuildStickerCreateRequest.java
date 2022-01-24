package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildStickerCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildStickerCreateRequest.class)
public interface GuildStickerCreateRequest {

    static ImmutableGuildStickerCreateRequest.Builder builder() {
        return ImmutableGuildStickerCreateRequest.builder();
    }

    String name();
    String description();
    String tags();
    String file();
}
