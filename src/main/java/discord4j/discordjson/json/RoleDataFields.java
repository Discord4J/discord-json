package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;

public interface RoleDataFields {

    Id id();

    String name();

    int color();

    boolean hoist();

    long permissions();

    boolean mentionable();

    Possible<Optional<String>> icon();

    @JsonProperty("unicode_emoji")
    Possible<Optional<String>> unicodeEmoji();

    Possible<RoleTagsData> tags();

    int flags();
}
