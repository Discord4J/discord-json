package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleCreateRequest.class)
@JsonDeserialize(as = ImmutableAutoModRuleCreateRequest.class)
public interface AutoModRuleCreateRequest {

    static ImmutableAutoModRuleCreateRequest.Builder builder() {
        return ImmutableAutoModRuleCreateRequest.builder();
    }

    String name();

    @JsonProperty("event_type")
    int eventType();

    @JsonProperty("trigger_type")
    int triggerType();

    @JsonProperty("trigger_metadata")
    Possible<AutoModTriggerMetaData> triggerMetadata();

    List<AutoModActionData> actions();

    Possible<Boolean> enabled();

    @JsonProperty("exempt_roles")
    Possible<List<Id>> exemptRoles();

    @JsonProperty("exempt_channels")
    Possible<List<Id>> exemptChannels();

}
