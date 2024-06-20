package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingPromptData.class)
@JsonDeserialize(as = ImmutableOnboardingPromptData.class)
public interface OnboardingPromptData extends BaseOnboardingPromptData {

    static ImmutableOnboardingPromptData.Builder builder() {
        return ImmutableOnboardingPromptData.builder();
    }

    Id id();

    List<OnboardingPromptOptionData> options();

}
