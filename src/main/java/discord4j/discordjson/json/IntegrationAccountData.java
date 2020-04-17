package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationAccountData.class)
@JsonDeserialize(as = ImmutableIntegrationAccountData.class)
public interface IntegrationAccountData {

    static ImmutableIntegrationAccountData.Builder builder() {
        return ImmutableIntegrationAccountData.builder();
    }

    String id();

    String name();
}
