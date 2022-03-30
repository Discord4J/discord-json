package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.json.StickerData;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildStickersUpdate.class)
@JsonDeserialize(as = ImmutableGuildStickersUpdate.class)
public interface GuildStickersUpdate extends Dispatch {

    static ImmutableGuildStickersUpdate.Builder builder() {
        return ImmutableGuildStickersUpdate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    List<StickerData> stickers();
}
