package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import java.util.List;

import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableOnboardingData.class)
@JsonDeserialize(as = ImmutableOnboardingData.class)
public interface OnboardingData {

    static ImmutableOnboardingData.Builder builder() {
        return ImmutableOnboardingData.builder();
    }

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    List<OnboardingPromptData> prompts();

    @JsonProperty("default_channel_ids")
    List<Id> defaultChannelIds();

    boolean enabled();

    int mode();

}
