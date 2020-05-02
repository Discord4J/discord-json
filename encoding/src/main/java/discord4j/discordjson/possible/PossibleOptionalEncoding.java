package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;
import reactor.util.annotation.Nullable;

import java.util.Objects;
import java.util.Optional;

@Encoding
public class PossibleOptionalEncoding<T> {

    @Encoding.Impl
    private Possible<Optional<T>> field = discord4j.discordjson.possible.Possible.absent();

    @Encoding.Copy
    public Possible<Optional<T>> withPossible(final Possible<Optional<T>> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Possible<Optional<T>> with(final @Nullable T value) {
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
