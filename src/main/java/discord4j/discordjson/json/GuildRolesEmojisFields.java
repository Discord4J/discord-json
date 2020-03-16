package discord4j.discordjson.json;

import java.util.List;

interface GuildRolesEmojisFields {

    List<RoleData> roles();

    List<EmojiData> emojis();
}
