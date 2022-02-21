package discord4j.discordjson.json;

import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;

public interface RoleDataFields {

    Id id();

    String name();

    int color();

    boolean hoist();

    long permissions();

    boolean mentionable();

    Possible<String> icon();

    Possible<String> unicodeEmoji();

    Possible<RoleTagsData> tags();
}
