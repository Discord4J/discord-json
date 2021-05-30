package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;
import reactor.util.annotation.Nullable;

import java.util.Objects;
import java.util.Optional;

@Encoding
public class PossibleOptionalEncoding<T> {

    @Encoding.Impl(virtual = true)
    private Possible<Optional<T>> possible = discord4j.discordjson.possible.Possible.absent();

    private final T value = discord4j.discordjson.possible.Possible.flatOpt(possible).orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<Optional<T>> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() :
                discord4j.discordjson.possible.Possible.of(Optional.ofNullable(value));
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return !absent;
    }

    @Encoding.Naming("*OrElse")
    T orElse(T defaultValue) {
        return !absent ? value : defaultValue;
    }

    @Encoding.Copy
    public Possible<Optional<T>> withPossible(final Possible<Optional<T>> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Naming("with*OrNull")
    @Encoding.Copy
    public Possible<Optional<T>> withOrNull(final @Nullable T value) {
        return discord4j.discordjson.possible.Possible.of(Optional.ofNullable(value));
    }

    @Encoding.Builder
    static class Builder<T> {

        private Possible<Optional<T>> possible = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<Optional<T>> value) {
            this.possible = value;
        }

        @Encoding.Init
        public void setValue(@Nullable T value) {
            this.possible = discord4j.discordjson.possible.Possible.of(Optional.ofNullable(value));
        }

        @Encoding.Build
        Possible<Optional<T>> build() {
            return this.possible;
        }
    }
}
