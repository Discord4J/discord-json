package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleModifyRequest.class)
@JsonDeserialize(as = ImmutableAutoModRuleModifyRequest.class)
public interface AutoModRuleModifyRequest {

    static ImmutableAutoModRuleModifyRequest.Builder builder() {
        return ImmutableAutoModRuleModifyRequest.builder();
    }

    Possible<String> name();

    @JsonProperty("event_type")
    Possible<Integer> eventType();

    @JsonProperty("trigger_metadata")
    Possible<AutoModTriggerMetaData> triggerMetadata();

    Possible<List<AutoModActionData>> actions();

    Possible<Boolean> enabled();

    @JsonProperty("exempt_roles")
    Possible<List<Id>> exemptRoles();

    @JsonProperty("exempt_channels")
    Possible<List<Id>> exemptChannels();

}
