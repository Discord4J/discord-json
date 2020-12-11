package discord4j.discordjson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Objects;

public class Id {

    private final long value;

    public static Id of(final long value) {
        return new Id(value);
    }

    public static Id of(final String value) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Id id = (Id) o;
        return value == id.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
