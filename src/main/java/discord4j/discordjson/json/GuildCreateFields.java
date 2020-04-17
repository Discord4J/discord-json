package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import discord4j.discordjson.possible.Possible;

interface GuildCreateFields extends GuildUpdateFields {

    @JsonProperty("joined_at")
    String joinedAt();

    boolean large();

    // ambiguous discord docs mention these fields are only present during GUILD_CREATE,
    // but this value can still be absent
    Possible<Boolean> unavailable();

    @JsonProperty("member_count")
    int memberCount();
}
