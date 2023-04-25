package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleSubscriptionData.class)
@JsonDeserialize(as = ImmutableRoleSubscriptionData.class)
public interface RoleSubscriptionData {

    static ImmutableRoleSubscriptionData.Builder builder() {
        return ImmutableRoleSubscriptionData.builder();
    }

    @JsonProperty("role_subscription_listing_id")
    Id id();

    @JsonProperty("tier_name")
    String tierName();

    @JsonProperty("total_months_subscribed")
    int totalMonthsSubscribed();

    @JsonProperty("is_renewal")
    boolean isRenewal();
}
