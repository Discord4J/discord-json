package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingEditPromptData.class)
@JsonDeserialize(as = ImmutableOnboardingEditPromptData.class)
public interface OnboardingEditPromptData {

    static ImmutableOnboardingEditPromptData.Builder builder() {
        return ImmutableOnboardingEditPromptData.builder();
    }

    List<OnboardingEditPromptOptionData> options();

}
