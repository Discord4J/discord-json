package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import org.immutables.value.Value;
import java.util.List;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleData.class)
@JsonDeserialize(as = ImmutableAutoModRuleData.class)
public interface AutoModRuleData {

    static ImmutableAutoModRuleData.Builder builder() {
        return ImmutableAutoModRuleData.builder();
    }

    String name();

    @JsonProperty("event_type")
    int eventType();

    @JsonProperty("trigger_type")
    int triggerType();

    @JsonProperty("trigger_metadata")
    Object triggerMetadata();

    List<AutoModActionData> actions();

    boolean enabled();

    @JsonProperty("exempt_roles")
    List<Id> exemptRoles();

    @JsonProperty("exempt_channels")
    List<Id> exemptChannels();

}
