package discord4j.discordjson.possible;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class Id {

    private final long value;

    public static Id of(final long value) {
        return new Id(value);
    }

    @JsonCreator
    private Id(String value) {
        this.value = Long.parseUnsignedLong(value);
    }

    private Id(long value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return Long.toUnsignedString(value);
    }

    public long longValue() {
        return value;
    }
}
