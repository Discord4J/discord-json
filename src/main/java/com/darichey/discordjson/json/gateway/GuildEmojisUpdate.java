package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.EmojiData;
import com.darichey.discordjson.json.UserData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildEmojisUpdate.class)
public interface GuildEmojisUpdate extends Dispatch {

    @JsonProperty("guild_id")
    String guild();
    List<EmojiData> emojis();
}
