package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingEditPromptData.class)
@JsonDeserialize(as = ImmutableOnboardingEditPromptData.class)
public interface OnboardingEditPromptData {

    static ImmutableOnboardingEditPromptData.Builder builder() {
        return ImmutableOnboardingEditPromptData.builder();
    }

    int type();

    List<OnboardingEditPromptOptionData> options();

    String title();

    @JsonProperty("single_select")
    boolean singleSelect();

    boolean required();

    @JsonProperty("in_onboarding")
    boolean inOnboarding();

}
