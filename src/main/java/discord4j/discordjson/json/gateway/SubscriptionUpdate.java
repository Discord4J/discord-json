package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SubscriptionData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSubscriptionUpdate.class)
@JsonDeserialize(as = ImmutableSubscriptionUpdate.class)
public interface SubscriptionUpdate {

    static ImmutableSubscriptionUpdate.Builder builder() {
        return ImmutableSubscriptionUpdate.builder();
    }

    @JsonUnwrapped
    SubscriptionData subscription();

}
