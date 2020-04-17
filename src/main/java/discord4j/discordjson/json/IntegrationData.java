package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationData.class)
@JsonDeserialize(as = ImmutableIntegrationData.class)
public interface IntegrationData {

    String id();

    String name();

    String type();

    boolean enabled();

    boolean syncing();

    @JsonProperty("role_id")
    String roleId();

    @JsonProperty("enable_emoticons")
    Possible<Boolean> enableEmoticons();

    @JsonProperty("expire_behavior")
    int expireBehavior();

    @JsonProperty("expire_grace_period")
    int expireGracePeriod();

    UserData user();

    IntegrationAccountData account();

    @JsonProperty("synced_at")
    String syncedAt();
}
