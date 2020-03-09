package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EmojiData;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmojisUpdate.class)
@JsonDeserialize(as = ImmutableGuildEmojisUpdate.class)
public interface GuildEmojisUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guild();
    List<EmojiData> emojis();
}
