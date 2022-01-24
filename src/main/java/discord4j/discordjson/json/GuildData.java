package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildData.class)
@JsonDeserialize(as = ImmutableGuildData.class)
public interface GuildData extends GuildCreateFields {

    static ImmutableGuildData.Builder builder() {
        return ImmutableGuildData.builder();
    }

    List<Id> roles();

    List<Id> emojis();

    Possible<List<Id>> stickers();

    List<Id> members();

    List<Id> channels();
}
