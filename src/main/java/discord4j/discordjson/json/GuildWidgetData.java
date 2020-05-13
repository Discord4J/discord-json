package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableGuildWidgetData.class)
@JsonDeserialize(as = ImmutableGuildWidgetData.class)
public interface GuildWidgetData {

    static ImmutableGuildWidgetData.Builder builder() {
        return ImmutableGuildWidgetData.builder();
    }

    boolean enabled();

    @JsonProperty("channel_id")
    Optional<String> channelId();

}
