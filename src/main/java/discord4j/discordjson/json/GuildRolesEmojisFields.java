package discord4j.discordjson.json;

import java.util.List;

public interface GuildRolesEmojisFields {

    List<RoleData> roles();

    List<EmojiData> emojis();

    List<StickerData> stickers();
}
