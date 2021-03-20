package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmojisUpdate.class)
@JsonDeserialize(as = ImmutableGuildEmojisUpdate.class)
public interface GuildEmojisUpdate extends Dispatch {

    static ImmutableGuildEmojisUpdate.Builder builder() {
        return ImmutableGuildEmojisUpdate.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();
    List<EmojiData> emojis();
}
