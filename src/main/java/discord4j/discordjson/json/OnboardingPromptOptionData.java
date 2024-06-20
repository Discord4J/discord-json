package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingPromptOptionData.class)
@JsonDeserialize(as = ImmutableOnboardingPromptOptionData.class)
public interface OnboardingPromptOptionData extends BaseOnboardingPromptOptionData {

    static ImmutableOnboardingPromptOptionData.Builder builder() {
        return ImmutableOnboardingPromptOptionData.builder();
    }

    Id id();

    Possible<EmojiData> emoji();

}
