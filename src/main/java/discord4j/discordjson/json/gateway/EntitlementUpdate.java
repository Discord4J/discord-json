package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EntitlementData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEntitlementUpdate.class)
@JsonDeserialize(as = ImmutableEntitlementUpdate.class)
public interface EntitlementUpdate extends Dispatch {

    static ImmutableEntitlementUpdate.Builder builder() {
        return ImmutableEntitlementUpdate.builder();
    }

    @JsonUnwrapped
    EntitlementData entitlement();

}
