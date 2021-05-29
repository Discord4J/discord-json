package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import reactor.util.annotation.Nullable;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildCreateRequest.class)
@JsonDeserialize(as = ImmutableGuildCreateRequest.class)
public interface GuildCreateRequest {

    static ImmutableGuildCreateRequest.Builder builder() {
        return ImmutableGuildCreateRequest.builder();
    }

    String name();

    Possible<String> region();

    Possible<String> icon();

    @JsonProperty("verification_level")
    Possible<Integer> verificationLevel();

    @JsonProperty("default_message_notifications")
    Possible<Integer> defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    Possible<Integer> explicitContentFilter();

    Possible<List<RoleCreateRequest>> roles();

    Possible<List<PartialChannelCreateRequest>> channels();

    @JsonProperty("afk_channel_id")
    Possible<Id> afkChannelId();

    @JsonProperty("afk_timeout")
    Possible<Integer> afkTimeout();

    @JsonProperty("system_channel_id")
    Possible<Id> systemChannelId();

    @JsonProperty("system_channel_flags")
    Possible<Integer> systemChannelFlags();

}
