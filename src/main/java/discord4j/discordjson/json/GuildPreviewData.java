package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildPreviewData.class)
@JsonDeserialize(as = ImmutableGuildPreviewData.class)
public interface GuildPreviewData {

    static ImmutableGuildPreviewData.Builder builder() {
        return ImmutableGuildPreviewData.builder();
    }

    String id();
    String name();
    Optional<String> icon();
    Optional<String> splash();
    @JsonProperty("discovery_splash")
    Optional<String> discoverySplash();
    List<EmojiData> emojis();
    List<String> features();
    @JsonProperty("approximate_member_count")
    int approximateMemberCount();
    @JsonProperty("approximate_presence_count")
    int approximatePresenceCount();
    Optional<String> description();

}