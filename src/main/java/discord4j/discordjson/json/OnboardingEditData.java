package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingEditData.class)
@JsonDeserialize(as = ImmutableOnboardingEditData.class)
public interface OnboardingEditData extends BaseOnboardingData {

    static ImmutableOnboardingEditData.Builder builder() {
        return ImmutableOnboardingEditData.builder();
    }

    List<OnboardingEditPromptData> prompts();

}
