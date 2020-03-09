package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildModifyRequest.class)
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
