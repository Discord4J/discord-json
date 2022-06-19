package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.AutoModRuleData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleDelete.class)
@JsonDeserialize(as = ImmutableAutoModRuleDelete.class)
public interface AutoModRuleDelete extends Dispatch {

    static ImmutableAutoModRuleDelete.Builder builder() {
        return ImmutableAutoModRuleDelete.builder();
    }

    @JsonUnwrapped
    AutoModRuleData automodrule();

}
