package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class PossibleEncoding<T> {

    @Encoding.Impl
    private Possible<T> field = discord4j.discordjson.possible.Possible.absent();

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
