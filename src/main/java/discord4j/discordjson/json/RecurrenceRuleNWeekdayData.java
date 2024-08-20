package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRecurrenceRuleNWeekdayData.class)
@JsonDeserialize(as = ImmutableRecurrenceRuleNWeekdayData.class)
public interface RecurrenceRuleNWeekdayData {

    static ImmutableRecurrenceRuleNWeekdayData.Builder builder() {
        return ImmutableRecurrenceRuleNWeekdayData.builder();
    }

    int n();

    int day();

}
