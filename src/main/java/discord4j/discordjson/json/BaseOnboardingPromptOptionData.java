package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableBaseOnboardingPromptOptionData.class)
@JsonDeserialize(as = ImmutableBaseOnboardingPromptOptionData.class)
public interface BaseOnboardingPromptOptionData {

    static ImmutableBaseOnboardingPromptOptionData.Builder builder() {
        return ImmutableBaseOnboardingPromptOptionData.builder();
    }

    @JsonProperty("channel_ids")
    List<Id> channelsIds();

    @JsonProperty("role_ids")
    List<Id> rolesIds();

    String title();

    Optional<String> description();

}
