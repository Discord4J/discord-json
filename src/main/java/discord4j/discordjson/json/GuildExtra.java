package discord4j.discordjson.json;

import java.util.List;

interface GuildExtra {

    List<RoleData> roles();

    List<EmojiData> emojis();
}
