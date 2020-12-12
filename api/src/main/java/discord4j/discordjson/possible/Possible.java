package discord4j.discordjson.possible;

import reactor.util.annotation.Nullable;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public final class Possible<T> {

    private static final Object ABSENT_VALUE = new Object();
    private static final Possible<?> ABSENT = new Possible<>(ABSENT_VALUE);

    public static <T> Possible<T> of(T value) {
        return new Possible<>(Objects.requireNonNull(value));
    }

    @SuppressWarnings("unchecked")
    public static <T> Possible<T> absent() {
        return (Possible<T>) ABSENT;
    }

    public static <T> Optional<T> flatOpt(Possible<Optional<T>> possible) {
        return possible.toOptional().flatMap(Function.identity());
    }

    private final T value;

    private Possible(T value) {
        this.value = value;
    }

    public boolean isAbsent() {
        return value == ABSENT_VALUE;
    }

    public T get() {
        if (isAbsent()) {
            throw new NoSuchElementException();
        }
        return value;
    }

    public Optional<T> toOptional() {
        if (isAbsent()) {
            return Optional.empty();
        }
        return Optional.of(value);
    }

    public <U> Possible<U> map(Function<? super T, ? extends U> mapper) {
        Objects.requireNonNull(mapper);
        if (isAbsent()) {
            return Possible.absent();
        } else {
            return Possible.of(mapper.apply(value));
        }
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
}
