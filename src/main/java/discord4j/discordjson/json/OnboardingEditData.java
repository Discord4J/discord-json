package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingEditData.class)
@JsonDeserialize(as = ImmutableOnboardingEditData.class)
public interface OnboardingEditData {

    static ImmutableOnboardingEditData.Builder builder() {
        return ImmutableOnboardingEditData.builder();
    }

    List<OnboardingEditPromptData> prompts();

    @JsonProperty("default_channel_ids")
    List<Id> defaultChannelIds();

    boolean enabled();

    int mode();

}
