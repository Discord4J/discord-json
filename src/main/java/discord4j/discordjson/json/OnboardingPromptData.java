package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;

import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingPromptData.class)
@JsonDeserialize(as = ImmutableOnboardingPromptData.class)
public interface OnboardingPromptData {

    static ImmutableOnboardingPromptData.Builder builder() {
        return ImmutableOnboardingPromptData.builder();
    }

    Possible<Id> id();

    int type();

    List<OnboardingPromptOptionData> options();

    String title();

    @JsonProperty("single_select")
    boolean singleSelect();

    boolean required();

    @JsonProperty("in_onboarding")
    boolean inOnboarding();

}
