package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SubscriptionData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSubscriptionDelete.class)
@JsonDeserialize(as = ImmutableSubscriptionDelete.class)
public interface SubscriptionDelete {

    static ImmutableSubscriptionDelete.Builder builder() {
        return ImmutableSubscriptionDelete.builder();
    }

    @JsonUnwrapped
    SubscriptionData subscription();

}
