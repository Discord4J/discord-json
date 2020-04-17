package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableConnectionData.class)
@JsonDeserialize(as = ImmutableConnectionData.class)
public interface ConnectionData {

    String id();
    String name();
    String type();
    Possible<Boolean> revoked();
    Possible<List<IntegrationData>> integrations();
    boolean verified();
    @JsonProperty("friend_sync")
    boolean friendSync();
    @JsonProperty("show_activity")
    boolean showActivity();
    int visibility();
}
