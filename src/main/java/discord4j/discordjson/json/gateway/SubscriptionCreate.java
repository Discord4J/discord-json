package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.SubscriptionData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSubscriptionCreate.class)
@JsonDeserialize(as = ImmutableSubscriptionCreate.class)
public interface SubscriptionCreate {

    static ImmutableSubscriptionCreate.Builder builder() {
        return ImmutableSubscriptionCreate.builder();
    }

    @JsonUnwrapped
    SubscriptionData subscription();

}
