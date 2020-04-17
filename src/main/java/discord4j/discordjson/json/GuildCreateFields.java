package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

interface GuildCreateFields extends GuildUpdateFields {

    @JsonProperty("joined_at")
    String joinedAt();

    boolean large();

    // TODO: FIX discord docs, as this can be absent from GUILD_CREATE
    Possible<Boolean> unavailable();

    @JsonProperty("member_count")
    int memberCount();
}
