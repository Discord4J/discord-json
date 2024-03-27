package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableReactionData.class)
@JsonDeserialize(as = ImmutableReactionData.class)
public interface ReactionData {

    static ImmutableReactionData.Builder builder() {
        return ImmutableReactionData.builder();
    }

    int count();

    @JsonProperty("count_details")
    ReactionCountDetailsData countDetails();

    boolean me();

    @JsonProperty("me_burst")
    boolean meBurst();

    EmojiData emoji();

    @JsonProperty("burst_colors")
    List<String> burstColors();
}
