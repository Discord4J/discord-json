package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandPermissionsData.class)
@JsonDeserialize(as = ImmutableApplicationCommandPermissionsData.class)
public interface ApplicationCommandPermissionsData {

    static ImmutableApplicationCommandPermissionsData.Builder builder() {
        return ImmutableApplicationCommandPermissionsData.builder();
    }

    Id id();

    int type();

    boolean permission();

}
