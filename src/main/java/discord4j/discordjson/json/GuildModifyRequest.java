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

    static ImmutableGuildModifyRequest.Builder builder() {
        return ImmutableGuildModifyRequest.builder();
    }

    Possible<? extends String> name();

    Possible<? extends String> region();

    @JsonProperty("verification_level")
    Possible<? extends Integer> verificationLevel();

    @JsonProperty("default_message_notifications")
    Possible<? extends Integer> defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    Possible<? extends Integer> explicitContentFilter();

    @JsonProperty("afk_channel_id")
    Possible<Optional<String>> afkChannelId();

    @JsonProperty("afk_timeout")
    Possible<? extends Integer> afkTimeout();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<? extends String> ownerId();

    Possible<Optional<String>> splash();

    Possible<Optional<String>> banner();

    @JsonProperty("system_channel_id")
    Possible<? extends String> systemChannelId();
}
