package discord4j.discordjson.possible;

import reactor.util.annotation.Nullable;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * A container for a value which may or may not be absent. If {@link #isAbsent()} is true, no value is present.
 * <p>
 * {@code Possible} is <i>extremely</i> similar to {@code Optional} and exists solely for (de)serialization purposes.
 * By combining {@code Possible} and {@code Optional}, we can model the four different possibilities for field
 * "types" <a href="https://discord.com/developers/docs/reference#nullable-and-optional-resource-fields">used by
 * Discord.</a>
 * <table>
 *     <tr>
 *         <th>Field name (in Discord docs)</th>
 *         <th>Type (in Discord docs)</th>
 *         <th>Java Type</th>
 *         <th>Meaning</th>
 *     </tr>
 *     <tr>
 *         <td>normal_field</td>
 *         <td>T</td>
 *         <td>T</td>
 *         <td>Always present, never null</td>
 *     </tr>
 *     <tr>
 *         <td>optional_field?</td>
 *         <td>T</td>
 *         <td>{@code Possible<T>}</td>
 *         <td>Sometimes present, but if present, never null</td>
 *     </tr>
 *     <tr>
 *         <td>nullable_field</td>
 *         <td>?T</td>
 *         <td>{@code Optional<T>}</td>
 *         <td>Always present, but possibly null</td>
 *     </tr>
 *     <tr>
 *         <td>optional_and_nullable_field?</td>
 *         <td>?T</td>
 *         <td>{@code Possible<Optional<T>>}</td>
 *         <td>Somtimes present, and even if present, possibly null</td>
 *     </tr>
 * </table>
 * <p>
 * <b>You probably don't need to use this class!</b>
 *
 * @param <T> The type of the stored value.
 */
public final class Possible<T> {

    private static final Object ABSENT_VALUE = new Object();
    private static final Possible<?> ABSENT = new Possible<>(ABSENT_VALUE);

    /**
     * Returns a {@code Possible} with the given value.
     *
     * @param value The value the returned Possible will store.
     * @param <T> The type the value.
     * @return A {@code Possible} with the given value.
     */
    public static <T> Possible<T> of(T value) {
        return new Possible<>(Objects.requireNonNull(value));
    }

    /**
     * Returns a {@code Possible} with no value.
     *
     * @param <T> The type of the non-existent value.
     * @return An absent {@code Possible}.
     */
    @SuppressWarnings("unchecked")
    public static <T> Possible<T> absent() {
        return (Possible<T>) ABSENT;
    }

    /**
     * Flattens a {@code Possible<Optional<T>>} into a {@code Optional<T>}. The returned {@code Optional} contains a
     * value iff the given {@code Possible} is not absent and its stored {@code Optional} is present.
     *
     * @param possible The {@code Possible} to flatten.
     * @param <T> The type of the inner value.
     * @return An {@code Optional} containing if the inner value, if any.
     */
    public static <T> Optional<T> flatOpt(Possible<Optional<T>> possible) {
        return possible.toOptional().flatMap(Function.identity());
    }

    private final T value;

    private Possible(T value) {
        this.value = value;
    }

    /**
     * If no value is stored, returns true, otherwise false.
     *
     * @return True if no value is stored, otherwise false.
     */
    public boolean isAbsent() {
        return value == ABSENT_VALUE;
    }

    /**
     * Gets the stored value, if any.
     * @throws NoSuchElementException If no value is stored.
     * @return The stored value, if any.
     */
    public T get() {
        if (isAbsent()) {
            throw new NoSuchElementException();
        }
        return value;
    }

    /**
     * Converts this {@code Possible} to an {@code Optional}. The returned {@code Optional} is present iff this
     * {@code Possible} is not absent.
     *
     * @return An {@code Optional} containing this {@code Possible}'s value, if it has one.
     */
    public Optional<T> toOptional() {
        if (isAbsent()) {
            return Optional.empty();
        }
        return Optional.of(value);
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Possible<?> possible = (Possible<?>) o;
        return Objects.equals(value, possible.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        if (isAbsent()) {
            return "Possible.absent";
        }
        return "Possible{" + value + '}';
    }

    /**
     * Map the current data to a new type.
     *
     * @param mapper the function to map the current data to a new type
     * @return a new Possible with the mapped data
     * @param <R> the new type
     */
    public <R> Possible<R> map(Function<T, R> mapper) {
        return isAbsent() ? Possible.absent() : Possible.of(mapper.apply(value));
    }
}
