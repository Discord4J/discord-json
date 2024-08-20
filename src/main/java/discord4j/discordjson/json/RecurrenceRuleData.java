package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRecurrenceRuleData.class)
@JsonDeserialize(as = ImmutableRecurrenceRuleData.class)
public interface RecurrenceRuleData {

    static ImmutableRecurrenceRuleData.Builder builder() {
        return ImmutableRecurrenceRuleData.builder();
    }

    Instant start();

    Optional<Instant> end();

    int frequency();

    int interval();

    @JsonProperty("by_weekday")
    Optional<List<Integer>> byWeekday();

    @JsonProperty("by_n_weekday")
    Optional<List<RecurrenceRuleNWeekdayData>> byNWeekday();

    @JsonProperty("by_month")
    Optional<List<Integer>> byMonth();

    @JsonProperty("by_month_day")
    Optional<List<Integer>> byMonthDay();

    @JsonProperty("by_year_day")
    Optional<List<Integer>> byYearDay();

    Optional<Integer> count();
}
