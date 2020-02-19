package com.discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableVoiceServerUpdate.class)
public interface VoiceServerUpdate extends Dispatch {

    String token();
    @JsonProperty("guild_id")
    String guildId();
    String endpoint();
}
