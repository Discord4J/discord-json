package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableIntegrationApplicationData.class)
@JsonDeserialize(as = ImmutableIntegrationApplicationData.class)
public interface IntegrationApplicationData {

    static ImmutableIntegrationApplicationData.Builder builder() {
        return ImmutableIntegrationApplicationData.builder();
    }

    String id();

    String name();

    Optional<String> icon();

    String description();

    String summary();

    Possible<UserData> bot();

}
