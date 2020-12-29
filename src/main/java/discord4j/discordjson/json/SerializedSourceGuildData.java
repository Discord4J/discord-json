package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableSerializedSourceGuildData.class)
@JsonDeserialize(as = ImmutableSerializedSourceGuildData.class)
public interface SerializedSourceGuildData {

    static ImmutableSerializedSourceGuildData.Builder builder() {
        return ImmutableSerializedSourceGuildData.builder();
    }

    String name();
    Optional<String> description();
    String region();
    @JsonProperty("verification_level")
    int verificationLevel();
    @JsonProperty("default_message_notifications")
    int defaultMessageNotifications();
    @JsonProperty("explicit_content_filter")
    int explicitContentFilter();
    @JsonProperty("preferred_locale")
    String preferredLocale();
    @JsonProperty("afk_timeout")
    int afkTimeout();
    List<RoleData> roles();
    List<ChannelData> channels();
    @JsonProperty("afk_channel_id")
    Optional<Integer> afkChannelId();
    @JsonProperty("system_channel_id")
    int systemChannelId();
    @JsonProperty("system_channel_flags")
    int systemChannelFlags();
    @JsonProperty("icon_hash")
    Optional<String> iconHash();
}
