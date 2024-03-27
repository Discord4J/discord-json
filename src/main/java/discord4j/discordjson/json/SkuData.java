package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSkuData.class)
@JsonDeserialize(as = ImmutableSkuData.class)
public interface SkuData {

    static ImmutableSkuData.Builder builder() {
        return ImmutableSkuData.builder();
    }

    Id id();

    int type();

    @JsonProperty("application_id")
    Id applicationId();

    String name();

    String slug();

    int flags();
}
