package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.AutoModRuleData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleUpdate.class)
@JsonDeserialize(as = ImmutableAutoModRuleUpdate.class)
public interface AutoModRuleUpdate extends Dispatch {

    static ImmutableAutoModRuleUpdate.Builder builder() {
        return ImmutableAutoModRuleUpdate.builder();
    }

    @JsonUnwrapped
    AutoModRuleData automodrule();

}
