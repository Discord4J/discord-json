package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableRoleTagsData.class)
@JsonDeserialize(as = ImmutableRoleTagsData.class)
public interface RoleTagsData {

    static ImmutableRoleTagsData.Builder builder() {
        return ImmutableRoleTagsData.builder();
    }

    @JsonProperty("bot_id")
    Possible<Id> botId();

    @JsonProperty("integration_id")
    Possible<Id> integrationId();

    // This field does not have any type and, if present, is always null. Its presence can be considered as 'true'
    @JsonProperty("premium_subscriber")
    Possible<Optional<Void>> premiumSubscriber();

}
