package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingData.class)
@JsonDeserialize(as = ImmutableOnboardingData.class)
public interface OnboardingData extends BaseOnboardingData {

    static ImmutableOnboardingData.Builder builder() {
        return ImmutableOnboardingData.builder();
    }

    @JsonProperty("guild_id")
    Id guildId();

    List<OnboardingPromptData> prompts();

}
