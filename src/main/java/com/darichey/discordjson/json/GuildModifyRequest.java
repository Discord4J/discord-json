package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildModifyRequest.class)
public interface GuildModifyRequest {

    default Possible<String> name() { return Possible.absent(); }

    default Possible<String> region() { return Possible.absent(); }

    @JsonProperty("verification_level")
    default Possible<Integer> verificationLevel() { return Possible.absent(); }

    @JsonProperty("default_message_notifications")
    default Possible<Integer> defaultMessageNotifications() { return Possible.absent(); }

    @JsonProperty("explicit_content_filter")
    default Possible<Integer> explicitContentFilter() { return Possible.absent(); }

    @JsonProperty("afk_channel_id")
    default Possible<Optional<String>> afkChannelId() { return Possible.absent(); }

    @JsonProperty("afk_timeout")
    default Possible<Integer> afkTimeout() { return Possible.absent(); }

    default Possible<Optional<String>> icon() { return Possible.absent(); }

    @JsonProperty("owner_id")
    default Possible<String> ownerId() { return Possible.absent(); }

    default Possible<Optional<String>> splash() { return Possible.absent(); }

    default Possible<Optional<String>> banner() { return Possible.absent(); }

    @JsonProperty("system_channel_id")
    default Possible<String> systemChannelId() { return Possible.absent(); }
}
