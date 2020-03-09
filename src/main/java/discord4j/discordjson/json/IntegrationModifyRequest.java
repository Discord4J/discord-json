package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationModifyRequest.class)
@JsonDeserialize(as = ImmutableIntegrationModifyRequest.class)
public interface IntegrationModifyRequest {

    @JsonProperty("expire_behavior")
    default Possible<Integer> expireBehavior() { return Possible.absent(); }
    @JsonProperty("expire_grace_period")
    default Possible<Integer> expireGracePeriod() { return Possible.absent(); }
    @JsonProperty("enable_emoticons")
    default Possible<Boolean> enableEmoticons() { return Possible.absent(); }
}
