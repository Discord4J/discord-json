package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingEditPromptOptionData.class)
@JsonDeserialize(as = ImmutableOnboardingEditPromptOptionData.class)
public interface OnboardingEditPromptOptionData extends BaseOnboardingPromptOptionData {

    static ImmutableOnboardingEditPromptOptionData.Builder builder() {
        return ImmutableOnboardingEditPromptOptionData.builder();
    }

    @JsonProperty("emoji_id")
    Possible<Id> emojiId();

    @JsonProperty("emoji_name")
    Possible<String> emojiName();

    @JsonProperty("emoji_animated")
    Possible<Boolean> emojiAnimated();

}
