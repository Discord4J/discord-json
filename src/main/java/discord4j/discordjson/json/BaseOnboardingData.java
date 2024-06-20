package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableBaseOnboardingData.class)
@JsonDeserialize(as = ImmutableBaseOnboardingData.class)
public interface BaseOnboardingData {

    static ImmutableBaseOnboardingData.Builder builder() {
        return ImmutableBaseOnboardingData.builder();
    }

    @JsonProperty("default_channel_ids")
    List<Id> defaultChannelIds();

    boolean enabled();

    int mode();

}
