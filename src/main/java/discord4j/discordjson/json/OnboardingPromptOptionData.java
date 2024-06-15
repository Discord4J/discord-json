package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;
import java.util.Optional;

import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingPromptOptionData.class)
@JsonDeserialize(as = ImmutableOnboardingPromptOptionData.class)
public interface OnboardingPromptOptionData {

    static ImmutableOnboardingPromptOptionData.Builder builder() {
        return ImmutableOnboardingPromptOptionData.builder();
    }

    Possible<Id> id();

    @JsonProperty("channel_ids")
    List<Id> channelsIds();

    @JsonProperty("role_ids")
    List<Id> rolesIds();

    Possible<EmojiData> emoji();

    @JsonProperty("emoji_id")
    Possible<Id> emojiId();

    @JsonProperty("emoji_name")
    Possible<String> emojiName();

    @JsonProperty("emoji_animated")
    Possible<Boolean> emojiAnimated();

    String title();

    Optional<String> description();

}
