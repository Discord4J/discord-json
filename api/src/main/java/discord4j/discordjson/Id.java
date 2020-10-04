package discord4j.discordjson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents an <i>unsigned</i> 64-bit ID. This object is serialized through String despite using long field for
 * storage and is used when building immutable objects for an alternative compact structure, reducing required memory.
 */
public class Id {

    private final long value;

    /**
     * Constructs an {@code ID} utilizing an <i>unsigned</i> ID.
     *
     * @param value The <i>unsigned</i> ID to construct a {@code ID}.
     * @return A constructed {@code ID} with the <i>unsigned</i> ID.
     */
    public static Id of(final long value) {
        return new Id(value);
    }

    /**
     * Constructs an {@code ID} utilizing an <i>unsigned</i> ID.
     *
     * @param value The <i>unsigned</i> ID to construct a {@code ID}. Must be non-null.
     * @return A constructed {@code ID} with the <i>unsigned</i> ID.
     * @throws NumberFormatException If {@code id} is not an <i>unsigned</i> ID.
     */
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

    /**
     * Gets the <i>unsigned</i> ID as an object String.
     *
     * @return The <i>unsigned</i> ID as String.
     */
    @JsonValue
    public String asString() {
        return Long.toUnsignedString(value);
    }

    /**
     * Gets the <i>unsigned</i> ID as a primitive long.
     *
     * @return The <i>unsigned</i> ID as long.
     */
    public long asLong() {
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
        return Long.hashCode(value);
    }

    @Override
    public String toString() {
        return asString();
    }
}
