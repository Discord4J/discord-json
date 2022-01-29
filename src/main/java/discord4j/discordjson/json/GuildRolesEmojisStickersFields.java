package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import java.util.List;

public interface GuildRolesEmojisStickersFields {

    List<RoleData> roles();

    List<EmojiData> emojis();

    Possible<List<StickerData>> stickers();
}
