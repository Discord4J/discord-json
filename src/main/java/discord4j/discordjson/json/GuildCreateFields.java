package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;

interface GuildCreateFields extends GuildUpdateFields {

    @JsonProperty("joined_at")
    String joinedAt();

    boolean large();

    boolean unavailable();

    @JsonProperty("member_count")
    int memberCount();
}
