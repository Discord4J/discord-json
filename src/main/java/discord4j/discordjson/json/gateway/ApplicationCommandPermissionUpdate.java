package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.GuildApplicationCommandPermissionsData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableApplicationCommandPermissionUpdate.class)
@JsonDeserialize(as = ImmutableApplicationCommandPermissionUpdate.class)
public interface ApplicationCommandPermissionUpdate extends Dispatch {

    static ImmutableApplicationCommandPermissionUpdate.Builder builder() {
        return ImmutableApplicationCommandPermissionUpdate.builder();
    }

    @JsonUnwrapped
    GuildApplicationCommandPermissionsData data();
}
