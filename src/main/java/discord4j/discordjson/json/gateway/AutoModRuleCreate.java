package discord4j.discordjson.json.gateway;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.json.AutoModRuleData;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableAutoModRuleCreate.class)
@JsonDeserialize(as = ImmutableAutoModRuleCreate.class)
public interface AutoModRuleCreate extends Dispatch {

    static ImmutableAutoModRuleCreate.Builder builder() {
        return ImmutableAutoModRuleCreate.builder();
    }

    @JsonUnwrapped
    AutoModRuleData automodrule();

}
