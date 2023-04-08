package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingPromptOptionData.class)
@JsonDeserialize(as = ImmutableOnboardingPromptOptionData.class)
public interface OnboardingPromptOptionData {

    static ImmutableOnboardingPromptOptionData.Builder builder() {
        return ImmutableOnboardingPromptOptionData.builder();
    }

    Id id();

    @JsonProperty("channel_ids")
    List<Id> channelsIds();

    @JsonProperty("role_ids")
    List<Id> rolesIds();

    EmojiData emoji();

    String title();

    Optional<String> description();

}
