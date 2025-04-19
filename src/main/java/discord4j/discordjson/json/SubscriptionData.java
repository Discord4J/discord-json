package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSubscriptionData.class)
@JsonDeserialize(as = ImmutableSubscriptionData.class)
public interface SubscriptionData {

    static ImmutableSubscriptionData.Builder builder() {
        return ImmutableSubscriptionData.builder();
    }

    Id id();

    @JsonProperty("user_id")
    Id userId();

    @JsonProperty("sku_ids")
    List<Id> skuIds();

    @JsonProperty("entitlement_ids")
    List<Id> entitlementIds();

    @JsonProperty("renewal_sku_ids")
    Optional<List<Id>> renewalSkuIds();

    @JsonProperty("current_period_start")
    String currentPeriodStart();

    @JsonProperty("current_period_end")
    String currentPeriodEnd();

    int status();

    @JsonProperty("canceled_at")
    Optional<String> canceledAt();

    Possible<String> country();

}
