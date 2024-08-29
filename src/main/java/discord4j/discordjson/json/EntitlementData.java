package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEntitlementData.class)
@JsonDeserialize(as = ImmutableEntitlementData.class)
public interface EntitlementData {

    static ImmutableEntitlementData.Builder builder() {
        return ImmutableEntitlementData.builder();
    }

    Id id();

    @JsonProperty("sku_id")
    Id skuId();

    @JsonProperty("application_id")
    Id applicationId();

    @JsonProperty("user_id")
    Possible<Id> userId();

    int type();

    boolean deleted();

    @JsonProperty("guild_id")
    Possible<Id> guildId();

    Possible<Boolean> consumed();

    // The following fields will not be present in test entitlements

    @JsonProperty("starts_at")
    Possible<String> startsAt();

    // This field return data for canceled renews or null
    @JsonProperty("ends_at")
    Possible<Optional<String>> endsAt();

    @JsonProperty("subscription_id")
    Possible<Id> subscriptionId();

}
