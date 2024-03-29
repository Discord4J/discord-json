package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationData.class)
@JsonDeserialize(as = ImmutableIntegrationData.class)
public interface IntegrationData {

    static ImmutableIntegrationData.Builder builder() {
        return ImmutableIntegrationData.builder();
    }

    Id id();

    String name();

    String type();

    Possible<Boolean> enabled();

    Possible<Boolean> syncing();

    @JsonProperty("role_id")
    Possible<Id> roleId();

    @JsonProperty("enable_emoticons")
    Possible<Boolean> enableEmoticons();

    @JsonProperty("expire_behavior")
    Possible<Integer> expireBehavior();

    @JsonProperty("expire_grace_period")
    Possible<Integer> expireGracePeriod();

    Possible<UserData> user();

    IntegrationAccountData account();

    @JsonProperty("synced_at")
    Possible<String> syncedAt();

    @JsonProperty("subscriber_count")
    Possible<Integer> subscriberCount();

    Possible<Boolean> revoked();

    Possible<IntegrationApplicationData> application();
}
