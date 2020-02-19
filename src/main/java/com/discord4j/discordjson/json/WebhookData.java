package com.discord4j.discordjson.json;

import com.discord4j.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableWebhookData.class)
public interface WebhookData {

    String id();

    int type();

    @JsonProperty("guild_id")
    Possible<String> guildId();

    @JsonProperty("channel_id")
    String channelId();

    Possible<UserData> user();

    Optional<String> name();

    Optional<String> avatar();

    Possible<String> token();
}
