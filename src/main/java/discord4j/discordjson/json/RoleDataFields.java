package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;

public interface RoleDataFields {

    String id();

    String name();

    int color();

    boolean hoist();

    long permissions();

    boolean mentionable();

    Possible<RoleTagsData> tags();
}
