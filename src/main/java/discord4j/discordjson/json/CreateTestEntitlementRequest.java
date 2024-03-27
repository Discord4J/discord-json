package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableCreateTestEntitlementRequest.class)
@JsonDeserialize(as = ImmutableCreateTestEntitlementRequest.class)
public interface CreateTestEntitlementRequest {

    static ImmutableCreateTestEntitlementRequest.Builder builder() {
        return ImmutableCreateTestEntitlementRequest.builder();
    }

    @JsonProperty("sku_id")
    Id skuId();

    @JsonProperty("owner_id")
    Id ownerId();

    @JsonProperty("owner_type")
    int ownerType();

}
