package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildEmojiModifyRequest.class)
@JsonDeserialize(as = ImmutableGuildEmojiModifyRequest.class)
public interface GuildEmojiModifyRequest {

    default Possible<String> name() { return Possible.absent(); }
    default Possible<List<String>> roles() { return Possible.absent(); }
}
