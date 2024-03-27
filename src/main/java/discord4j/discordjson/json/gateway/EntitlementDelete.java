package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.EntitlementData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableEntitlementDelete.class)
@JsonDeserialize(as = ImmutableEntitlementDelete.class)
public interface EntitlementDelete extends Dispatch {

    static ImmutableEntitlementDelete.Builder builder() {
        return ImmutableEntitlementDelete.builder();
    }

    @JsonUnwrapped
    EntitlementData entitlement();

}
