package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EntitlementData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEntitlementCreate.class)
@JsonDeserialize(as = ImmutableEntitlementCreate.class)
public interface EntitlementCreate extends Dispatch {

    static ImmutableEntitlementCreate.Builder builder() {
        return ImmutableEntitlementCreate.builder();
    }

    @JsonUnwrapped
    EntitlementData entitlement();

}
