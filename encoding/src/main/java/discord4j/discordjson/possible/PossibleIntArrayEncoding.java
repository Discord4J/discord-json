package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class PossibleIntArrayEncoding {

    @Encoding.Impl(virtual = true)
    private Possible<int[]> possible = discord4j.discordjson.possible.Possible.absent();

    private final int[] value = possible.toOptional().orElse(null);
    private final boolean absent = possible.isAbsent();

    @Encoding.Expose
    Possible<int[]> get() {
        return absent ? discord4j.discordjson.possible.Possible.absent() : discord4j.discordjson.possible.Possible.of(value);
    }

    @Encoding.Naming("is*Present")
    boolean isPresent() {
        return !absent;
    }

    @Encoding.Naming("*OrElse")
    int[] orElse(int[] defaultValue) {
        return !absent ? value : defaultValue;
    }

    @Encoding.Copy
    public Possible<int[]> withPossible(final Possible<int[]> value) {
        return Objects.requireNonNull(value);
    }

    @Encoding.Copy
    public Possible<int[]> with(final int[] value) {
        return discord4j.discordjson.possible.Possible.of(value);
    }

    @Encoding.Builder
    static class Builder {

        private Possible<int[]> possible = discord4j.discordjson.possible.Possible.absent();

        @Encoding.Init
        @Encoding.Copy
        public void set(Possible<int[]> value) {
            this.possible = value;
        }

        @Encoding.Init
        public void setValue(int[] value) {
            this.possible = discord4j.discordjson.possible.Possible.of(value);
        }

        @Encoding.Build
        Possible<int[]> build() {
            return this.possible;
        }
    }
}
