package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class PossibleEncoding<T> {

    @Encoding.Impl(virtual = true)
    private Possible<T> possible;

    private final T value = possible.toOptional().orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<T> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() : discord4j.discordjson.possible.Possible.of(value);
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
    public Possible<T> withPossible(final Possible<T> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Possible<T> with(final T value) {
        return discord4j.discordjson.possible.Possible.of(value);
    }

    @Encoding.Builder
    static class Builder<T> {

        private Possible<T> possible = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<T> value) {
            this.possible = value;
        }

        @Encoding.Init
        public void setValue(T value) {
            this.possible = discord4j.discordjson.possible.Possible.of(value);
        }

        @Encoding.Build
        Possible<T> build() {
            return this.possible;
        }
    }
}
