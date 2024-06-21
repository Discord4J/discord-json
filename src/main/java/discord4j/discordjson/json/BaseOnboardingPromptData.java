package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableBaseOnboardingPromptData.class)
@JsonDeserialize(as = ImmutableBaseOnboardingPromptData.class)
public interface BaseOnboardingPromptData {

    static ImmutableBaseOnboardingPromptData.Builder builder() {
        return ImmutableBaseOnboardingPromptData.builder();
    }

    int type();

    String title();

    @JsonProperty("single_select")
    boolean singleSelect();

    boolean required();

    @JsonProperty("in_onboarding")
    boolean inOnboarding();

}
